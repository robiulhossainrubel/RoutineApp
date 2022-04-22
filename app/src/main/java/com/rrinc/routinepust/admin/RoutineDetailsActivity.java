package com.rrinc.routinepust.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.RoutineInfo;

public class RoutineDetailsActivity extends AppCompatActivity {

    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_details);

        final String dept = getIntent().getStringExtra("dep");
        final String seme = getIntent().getStringExtra("sem");
        final String daay = getIntent().getStringExtra("day");
        final String ide = getIntent().getStringExtra("id");
        final String ttl = getIntent().getStringExtra("ttl");
        final String cod = getIntent().getStringExtra("cod");
        final String tim = getIntent().getStringExtra("tim");
        final String tec = getIntent().getStringExtra("tch");
        final String rom = getIntent().getStringExtra("rom");



        final EditText titl=(EditText)findViewById(R.id.etctl);
        titl.setText(ttl);
        final EditText code=(EditText)findViewById(R.id.etcc);
        code.setText(cod);
        final EditText time=(EditText)findViewById(R.id.ettime);
        time.setText(tim);
        final EditText tch=(EditText)findViewById(R.id.etti);
        tch.setText(tec);
        final EditText room=(EditText)findViewById(R.id.etroom);
        room.setText(rom);
        Button btn=(Button)findViewById(R.id.bt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cttl=titl.getText().toString();
                String ccode=code.getText().toString();
                String ctime=time.getText().toString();
                String ctch=tch.getText().toString();
                String croom=room.getText().toString();
                update(dept,seme,daay,ide,cttl,ccode,ctime,ctch,croom);
            }
        });
        Button btn2=(Button)findViewById(R.id.del);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete(dept,seme,daay,ide);
            }
        });
    }

    private void delete(String Dep, String Sem, String day, String id) {


        // ICE

        if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Friday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Friday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Friday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Friday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Friday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Friday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Friday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Friday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Friday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Friday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Friday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Friday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Friday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Friday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Friday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Friday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Friday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Friday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Friday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Friday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Friday").child(id);
        }





        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Saturday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Saturday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Saturday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Saturday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Saturday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Saturday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Saturday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Saturday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Saturday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Saturday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Saturday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Saturday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Saturday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Saturday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Saturday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Saturday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Saturday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Saturday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Saturday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Saturday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Saturday").child(id);
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Sunday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Sunday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Sunday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Sunday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Sunday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Sunday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Sunday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Sunday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Sunday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Sunday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Sunday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Sunday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Sunday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Sunday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Sunday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Sunday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Sunday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Sunday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Sunday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Sunday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Sunday").child(id);
        }




        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Monday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Monday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Monday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Monday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Monday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Monday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Monday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Monday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Monday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Monday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Monday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Monday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Monday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Monday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Monday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Monday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Monday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Monday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Monday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Monday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Monday").child(id);
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Tuesday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Tuesday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Tuesday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Tuesday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Tuesday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Tuesday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Tuesday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Tuesday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Tuesday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Tuesday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Tuesday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Tuesday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Tuesday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Tuesday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Tuesday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Tuesday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Tuesday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Tuesday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Tuesday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Tuesday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Tuesday").child(id);
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Wednesday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Wednesday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Wednesday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Wednesday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Wednesday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Wednesday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Wednesday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Wednesday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Wednesday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Wednesday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Wednesday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Wednesday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Wednesday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Wednesday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Wednesday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Wednesday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Wednesday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Wednesday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Wednesday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Wednesday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Wednesday").child(id);
        }


        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Thursday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Thursday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Thursday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Thursday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Thursday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Thursday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Thursday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Thursday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Thursday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Thursday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Thursday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Thursday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Thursday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Thursday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Thursday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Thursday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Thursday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Thursday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Thursday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Thursday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Thursday").child(id);
        }

        else{
            reference= FirebaseDatabase.getInstance().getReference("Routines").child(id);
        }


        reference.removeValue();
        Toast.makeText(getApplicationContext(),"Successfully Deleted",Toast.LENGTH_SHORT).show();
    }



    private void update(String Dep, String Sem, String day, String id,String titl,String code,String time,String tech,String room){



        // ICE

        if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Friday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Friday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Friday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Friday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Friday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Friday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Friday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Friday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Friday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Friday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Friday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Friday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Friday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Friday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Friday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Friday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Friday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Friday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Friday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Friday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Friday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Friday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Friday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Friday").child(id);
        }





        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Saturday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Saturday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Saturday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Saturday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Saturday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Saturday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Saturday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Saturday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Saturday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Saturday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Saturday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Saturday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Saturday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Saturday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Saturday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Saturday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Saturday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Saturday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Saturday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Saturday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Saturday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Saturday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Saturday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Saturday").child(id);
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Sunday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Sunday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Sunday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Sunday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Sunday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Sunday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Sunday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Sunday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Sunday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Sunday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Sunday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Sunday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Sunday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Sunday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Sunday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Sunday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Sunday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Sunday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Sunday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Sunday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Sunday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Sunday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Sunday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Sunday").child(id);
        }




        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Monday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Monday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Monday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Monday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Monday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Monday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Monday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Monday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Monday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Monday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Monday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Monday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Monday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Monday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Monday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Monday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Monday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Monday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Monday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Monday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Monday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Monday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Monday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Monday").child(id);
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Tuesday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Tuesday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Tuesday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Tuesday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Tuesday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Tuesday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Tuesday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Tuesday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Tuesday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Tuesday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Tuesday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Tuesday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Tuesday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Tuesday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Tuesday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Tuesday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Tuesday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Tuesday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Tuesday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Tuesday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Tuesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Tuesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Tuesday").child(id);
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Wednesday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Wednesday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Wednesday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Wednesday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Wednesday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Wednesday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Wednesday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Wednesday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Wednesday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Wednesday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Wednesday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Wednesday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Wednesday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Wednesday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Wednesday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Wednesday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Wednesday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Wednesday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Wednesday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Wednesday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Wednesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Wednesday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Wednesday").child(id);
        }


        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Thursday").child(id);
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Thursday").child(id);
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Thursday").child(id);
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Thursday").child(id);
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Thursday").child(id);
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Thursday").child(id);
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Thursday").child(id);
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Thursday").child(id);
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Thursday").child(id);
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Thursday").child(id);
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Thursday").child(id);
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Thursday").child(id);
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Thursday").child(id);
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Thursday").child(id);
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Thursday").child(id);
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Thursday").child(id);
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Thursday").child(id);
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Thursday").child(id);
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Thursday").child(id);
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Thursday").child(id);
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Thursday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Thursday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Thursday").child(id);
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Thursday").child(id);
        }

        else{
            reference= FirebaseDatabase.getInstance().getReference("Routines").child(id);
        }

        RoutineInfo info = new RoutineInfo(id,titl,code,time,tech,room);
        reference.setValue(info);

        Toast.makeText(getApplicationContext(),"Successfully Updated",Toast.LENGTH_SHORT).show();

    }

}
