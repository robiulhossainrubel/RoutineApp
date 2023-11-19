package com.rrinc.routinepust.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.RoutineInfo;

public class AddRoutineAdminActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    EditText ttl,cod,tim,tec,rom;
    Button btn,pop;
    String day;
    TextView tv,dept,seme;
    FirebaseUser user;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_addroutine);

        ttl = findViewById(R.id.etctl);
        cod = findViewById(R.id.etcc);
        tim = findViewById(R.id.ettime);
        tec = findViewById(R.id.etti);
        rom = findViewById(R.id.etroom);
        tv = findViewById(R.id.tv);
        dept = findViewById(R.id.deper);
        seme = findViewById(R.id.seme);
        btn = findViewById(R.id.bt);
        pop = findViewById(R.id.pop);

        user = FirebaseAuth.getInstance().getCurrentUser();

        final String dep = getIntent().getStringExtra("dep");
        final String sem = getIntent().getStringExtra("sem");

        dept.setText(dep);
        seme.setText(sem);

        btn.setOnClickListener(v -> {
            assert dep != null;
            saveData(dep,sem,day);
        });

    }


    private void saveData(String Dep, String Sem ,String day) {


        reference= FirebaseDatabase.getInstance().getReference("Routine").child(Dep).child(Sem).child(day);
        

        String key = reference.push().getKey();
        String titel = ttl.getText().toString();
        String code = cod.getText().toString();
        String time = tim.getText().toString();
        String tech = tec.getText().toString();
        String room = rom.getText().toString();

        RoutineInfo info = new RoutineInfo(key,titel,code,time,tech,room);
        reference.child(key).setValue(info);
        Toast.makeText(getApplicationContext(),"Routine added successfully",Toast.LENGTH_SHORT).show();
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
