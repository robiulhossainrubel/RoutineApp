package com.rrinc.routinepust.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.RoutineInfo;
import com.rrinc.routinepust.utils.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    TextView tv,tvs,tvd;
    Button btday,btdept,btyear,search;
    String day,dep,sem;
    RecyclerView recyclerView;
    DatabaseReference reference;
    private RecycleViewAdapter routineAdapter;
    private List<RoutineInfo> routineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        tv=(TextView)findViewById(R.id.da);
        tvd=(TextView)findViewById(R.id.de);
        tvs=(TextView)findViewById(R.id.ye);

        btday=(Button)findViewById(R.id.day);
        btdept=(Button)findViewById(R.id.dep);
        btyear=(Button)findViewById(R.id.sem);
        search=(Button)findViewById(R.id.search);

        recyclerView=(RecyclerView)findViewById(R.id.rtlst);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        routineList = new ArrayList<>();

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(day.isEmpty() && sem.isEmpty() && dep.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
                }else {
                    readData(dep, sem, day);
                }
            }
        });



    }
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_day);
        popup.show();
    }
    public void showPopup2(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_sem);
        popup.show();
    }
    public void showPopup3(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_department);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ice:
                dep = "ICE";
                tvd.setText("ICE");
                return true;
            case R.id.eee:
                dep = "EEE";
                tvd.setText("EEE");
                return true;
            case R.id.cse:
                dep = "CSE";
                tvd.setText("CSE");
                return true;
            case R.id.ete:
                dep = "ETE";
                tvd.setText("ETE");
                return true;
            case R.id.civil:
                dep = "CIVIL";
                tvd.setText("CIVIL");
                return true;
            case R.id.arch:
                dep = "Arch";
                tvd.setText("Arch");
                return true;
            case R.id.urp:
                dep = "URP";
                tvd.setText("URP");
                return true;
            case R.id.che:
                dep = "CHE";
                tvd.setText("CHE");
                return true;
            case R.id.phy:
                dep = "PHY";
                tvd.setText("PHY");
                return true;
            case R.id.mat:
                dep = "MAT";
                tvd.setText("MAT");
                return true;
            case R.id.stat:
                dep = "STAT";
                tvd.setText("STAT");
                return true;
            case R.id.ge:
                dep = "GE";
                tvd.setText("GE");
                return true;
            case R.id.pharm:
                dep = "PHARM";
                tvd.setText("PHARM");
                return true;
            case R.id.bba:
                dep = "BBA";
                tvd.setText("BBA");
                return true;
            case R.id.thm:
                dep = "THM";
                tvd.setText("THM");
                return true;
            case R.id.eco:
                dep = "ECO";
                tvd.setText("ECO");
                return true;
            case R.id.ban:
                dep = "BAN";
                tvd.setText("BAN");
                return true;
            case R.id.sw:
                dep = "SW";
                tvd.setText("SW");
                return true;
            case R.id.eng:
                dep = "ENG";
                tvd.setText("ENG");
                return true;
            case R.id.pa:
                dep = "PA";
                tvd.setText("PA");
                return true;
            case R.id.hbs:
                dep = "HBS";
                tvd.setText("HBS");
                return true;
            case R.id.sem1:
                sem = "1y";
                tvs.setText("1st Year");
                return true;
            case R.id.sem2:
                sem = "2y";
                tvs.setText("2nd Year");
                return true;
            case R.id.sem3:
                sem = "3y";
                tvs.setText("3rd Year");
                return true;
            case R.id.sem4:
                sem = "4y";
                tvs.setText("4th Year");
                return true;
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

    private void readData(String Dep, String Sem ,String day) {


        // ICE

        reference = FirebaseDatabase.getInstance().getReference("Routine").child(Dep).child(Sem).child(day);

        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                routineList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    RoutineInfo routine = snapshot.getValue(RoutineInfo.class);


                    routineList.add(routine);

                }
                routineAdapter = new RecycleViewAdapter(getApplicationContext(), routineList);
                recyclerView.setAdapter(routineAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(getApplicationContext(), "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
