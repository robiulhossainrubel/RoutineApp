package com.rrinc.routinepust.admin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.CT;

public class AddCtAdminActivity extends AppCompatActivity {

    EditText ttl,cod,tim,tec,rom,date,topic;
    Button btn;
    FirebaseUser user;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addct_admin);

        ttl = findViewById(R.id.etctl);
        cod = findViewById(R.id.etcc);
        tim = findViewById(R.id.ettime);
        tec = findViewById(R.id.etti);
        rom = findViewById(R.id.etroom);
        date = findViewById(R.id.etdate);
        topic = findViewById(R.id.ettopic);

        btn = findViewById(R.id.bt);

        user = FirebaseAuth.getInstance().getCurrentUser();

        final String dep = getIntent().getStringExtra("dep");
        final String sem = getIntent().getStringExtra("sem");

        btn.setOnClickListener(v -> {
            assert dep != null;
            saveData(dep,sem);
        });
    }

    private void saveData(String Dep, String Sem) {
        // ICE

        if (Dep.equals("ICE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ICE").child("1st_Year");
        }else if(Dep.equals("ICE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ICE").child("2nd_Year");
        }else if(Dep.equals("ICE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ICE").child("3rd_Year");
        }else if(Dep.equals("ICE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ICE").child("4th_Year");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("EEE").child("1st_Year");
        }else if(Dep.equals("EEE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("EEE").child("2nd_Year");
        }else if(Dep.equals("EEE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("EEE").child("3rd_Year");
        }else if(Dep.equals("EEE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("EEE").child("4th_Year");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CSE").child("1st_Year");
        }else if(Dep.equals("CSE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CSE").child("2nd_Year");
        }else if(Dep.equals("CSE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CSE").child("3rd_Year");
        }else if(Dep.equals("CSE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CSE").child("4th_Year");
        }



        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ETE").child("1st_Year");
        }else if(Dep.equals("ETE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ETE").child("2nd_Year");
        }else if(Dep.equals("ETE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ETE").child("3rd_Year");
        }else if(Dep.equals("ETE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ETE").child("4th_Year");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CIVIL").child("1st_Year");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CIVIL").child("2nd_Year");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CIVIL").child("3rd_Year");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CIVIL").child("4th_Year");
        }


        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("Arch").child("1st_Year");
        }else if(Dep.equals("Arch") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("Arch").child("2nd_Year");
        }else if(Dep.equals("Arch") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("Arch").child("3rd_Year");
        }else if(Dep.equals("Arch") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("Arch").child("4th_Year");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("URP").child("1st_Year");
        }else if(Dep.equals("URP") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("URP").child("2nd_Year");
        }else if(Dep.equals("URP") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("URP").child("3rd_Year");
        }else if(Dep.equals("URP") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("URP").child("4th_Year");
        }


        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CHE").child("1st_Year");
        }else if(Dep.equals("CHE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CHE").child("2nd_Year");
        }else if(Dep.equals("CHE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CHE").child("3rd_Year");
        }else if(Dep.equals("CHE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("CHE").child("4th_Year");
        }


        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHY").child("1st_Year");
        }else if(Dep.equals("PHY") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHY").child("2nd_Year");
        }else if(Dep.equals("PHY") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHY").child("3rd_Year");
        }else if(Dep.equals("PHY") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHY").child("4th_Year");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("MAT").child("1st_Year");
        }else if(Dep.equals("MAT") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("MAT").child("2nd_Year");
        }else if(Dep.equals("MAT") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("MAT").child("3rd_Year");
        }else if(Dep.equals("MAT") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("MAT").child("4th_Year");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("STAT").child("1st_Year");
        }else if(Dep.equals("STAT") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("STAT").child("2nd_Year");
        }else if(Dep.equals("STAT") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("STAT").child("3rd_Year");
        }else if(Dep.equals("STAT") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("STAT").child("4th_Year");
        }


        // GE

        else if (Dep.equals("GE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("GE").child("1st_Year");
        }else if(Dep.equals("GE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("GE").child("2nd_Year");
        }else if(Dep.equals("GE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("GE").child("3rd_Year");
        }else if(Dep.equals("GE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("GE").child("4th_Year");
        }


        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHARM").child("1st_Year");
        }else if(Dep.equals("PHARM") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHARM").child("2nd_Year");
        }else if(Dep.equals("PHARM") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHARM").child("3rd_Year");
        }else if(Dep.equals("PHARM") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PHARM").child("4th_Year");
        }


        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BBA").child("1st_Year");
        }else if(Dep.equals("BBA") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BBA").child("2nd_Year");
        }else if(Dep.equals("BBA") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BBA").child("3rd_Year");
        }else if(Dep.equals("BBA") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BBA").child("4th_Year");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("THM").child("1st_Year");
        }else if(Dep.equals("THM") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("THM").child("2nd_Year");
        }else if(Dep.equals("THM") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("THM").child("3rd_Year");
        }else if(Dep.equals("THM") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("THM").child("4th_Year");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ECO").child("1st_Year");
        }else if(Dep.equals("ECO") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ECO").child("2nd_Year");
        }else if(Dep.equals("ECO") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ECO").child("3rd_Year");
        }else if(Dep.equals("ECO") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ECO").child("4th_Year");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BAN").child("1st_Year");
        }else if(Dep.equals("BAN") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BAN").child("2nd_Year");
        }else if(Dep.equals("BAN") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BAN").child("3rd_Year");
        }else if(Dep.equals("BAN") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("BAN").child("4th_Year");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("SW").child("1st_Year");
        }else if(Dep.equals("SW") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("SW").child("2nd_Year");
        }else if(Dep.equals("SW") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("SW").child("3rd_Year");
        }else if(Dep.equals("SW") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("SW").child("4th_Year");
        }


        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ENG").child("1st_Year");
        }else if(Dep.equals("ENG") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ENG").child("2nd_Year");
        }else if(Dep.equals("ENG") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ENG").child("3rd_Year");
        }else if(Dep.equals("ENG") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("ENG").child("4th_Year");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PA").child("1st_Year");
        }else if(Dep.equals("PA") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PA").child("2nd_Year");
        }else if(Dep.equals("PA") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PA").child("3rd_Year");
        }else if(Dep.equals("PA") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("PA").child("4th_Year");
        }



        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("HBS").child("1st_Year");
        }else if(Dep.equals("HBS") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("HBS").child("2nd_Year");
        }else if(Dep.equals("HBS") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("HBS").child("3rd_Year");
        }else if(Dep.equals("HBS") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("ClassTest").child("HBS").child("4th_Year");
        }

        else {
            reference = FirebaseDatabase.getInstance().getReference("ClassTest");
        }

        String key = reference.push().getKey();
        String titel = ttl.getText().toString();
        String code = cod.getText().toString();
        String time = tim.getText().toString();
        String tech = tec.getText().toString();
        String room = rom.getText().toString();
        String dat = date.getText().toString();
        String top = topic.getText().toString();

        CT info = new CT(titel,code,top,tech,dat,room,time,key);
        assert key != null;
        reference.child(key).setValue(info);
        Toast.makeText(getApplicationContext(),"CT added successfully",Toast.LENGTH_SHORT).show();

    }
}
