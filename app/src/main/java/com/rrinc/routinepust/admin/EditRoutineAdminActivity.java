package com.rrinc.routinepust.admin;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.RoutineInfo;
import com.rrinc.routinepust.utils.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class EditRoutineAdminActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    ListView r;
    TextView tv;
    Button btn;
    ListViewAdapter routineAdapter;
    List<RoutineInfo> routineList;

    DatabaseReference reference;
    String day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_editroutine);

        final String dept = getIntent().getStringExtra("dep");
        final String seme = getIntent().getStringExtra("sem");

        tv = findViewById(R.id.tv);
        btn= findViewById(R.id.pops);
        r = findViewById(R.id.rec1);



        btn.setOnClickListener(v -> {
            routineList =new ArrayList<>();

            read(dept,seme,day);

        });

        r.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent= new Intent(getApplicationContext(),RoutineDetailsActivity.class);
            RoutineInfo info = routineList.get(position);
            intent.putExtra("id",info.getRtID());
            intent.putExtra("ttl",info.getClsTitl());
            intent.putExtra("cod",info.getClsCode());
            intent.putExtra("tim",info.getClsTime());
            intent.putExtra("tch",info.getClsTech());
            intent.putExtra("rom",info.getClsRoom());
            intent.putExtra("dep",dept);
            intent.putExtra("sem",seme);
            intent.putExtra("day",day);
            startActivity(intent);

        });


    }

    private void showActionsDialog(final int position) {
        CharSequence colors[] = new CharSequence[]{"Edit", "Delete"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose option");
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {

                } else {

                }
            }
        });
        builder.show();
    }

    private void read(String Dep, String Sem,String day) {


        // ICE
        reference= FirebaseDatabase.getInstance().getReference("Routine").child(Dep).child(Sem).child(day);


        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                routineList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    RoutineInfo routine = snapshot.getValue(RoutineInfo.class);


                    routineList.add(routine);

                }
                routineAdapter = new ListViewAdapter(getApplicationContext(), routineList);
                r.setAdapter(routineAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(getApplicationContext(), "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void showUpdateDialog(String id,String titl,String code,String time,String tch,String room){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.edit_routine,null);

        final EditText rtitl=(EditText)dialogView.findViewById(R.id.etctl);
        final EditText rcode=(EditText)dialogView.findViewById(R.id.etcc);
        final EditText rtime=(EditText)dialogView.findViewById(R.id.ettime);
        final EditText rtch=(EditText)dialogView.findViewById(R.id.etti);
        final EditText rroom=(EditText)dialogView.findViewById(R.id.etroom);
        Button bn=(Button)dialogView.findViewById(R.id.bt);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        dialogBuilder.setTitle("Updating Routine"+code);
        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_day);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sat:
                day = "sat";
                tv.setText("Saturday");
                return true;
            case R.id.sun:
                day = "sun";
                tv.setText("Sunday");
                return true;
            case R.id.mon:
                day = "mon";
                tv.setText("Monday");
                return true;
            case R.id.tue:
                day = "tue";
                tv.setText("Tuesday");
                return true;
            case R.id.wed:
                day = "wed";
                tv.setText("Wednesday");
                return true;
            case R.id.thu:
                day = "thu";
                tv.setText("Thursday");
                return true;
            case R.id.fri:
                day = "fri";
                tv.setText("Friday");
                return true;
            default:
                return false;
        }
    }
}
