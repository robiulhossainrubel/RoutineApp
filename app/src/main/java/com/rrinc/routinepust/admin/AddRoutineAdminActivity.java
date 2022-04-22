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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               saveData(dep,sem,day);
            }
        });

    }


    private void saveData(String Dep, String Sem ,String day) {


        // ICE

        if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Friday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Friday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Friday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Friday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Friday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Friday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Friday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Friday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Friday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Friday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Friday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Friday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Friday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Friday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Friday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Friday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Friday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Friday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Friday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Friday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Friday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Friday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Friday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Friday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Friday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Friday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Friday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Friday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Friday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Friday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Friday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Friday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Friday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Friday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Friday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Friday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Friday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Friday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Friday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Friday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Friday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Friday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Friday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Friday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Friday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Friday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Friday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Friday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Friday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Friday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Friday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Friday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Friday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Friday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Friday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Friday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Friday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Friday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Friday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Friday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Friday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Friday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Friday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Friday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Friday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Friday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Friday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Friday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Friday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Friday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Friday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Friday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Friday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Friday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Friday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Friday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Friday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Friday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Friday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Friday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Friday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Friday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Friday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("fri")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Friday");
        }





        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Saturday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Saturday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Saturday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Saturday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Saturday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Saturday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Saturday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Saturday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Saturday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Saturday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Saturday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Saturday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Saturday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Saturday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Saturday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Saturday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Saturday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Saturday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Saturday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Saturday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Saturday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Saturday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Saturday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Saturday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Saturday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Saturday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Saturday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Saturday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Saturday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Saturday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Saturday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Saturday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Saturday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("sat")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Saturday");
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Sunday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Sunday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Sunday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Sunday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Sunday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Sunday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Sunday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Sunday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Sunday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Sunday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Sunday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Sunday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Sunday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Sunday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Sunday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Sunday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Sunday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Sunday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Sunday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Sunday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Sunday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Sunday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Sunday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Sunday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Sunday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Sunday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Sunday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Sunday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Sunday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Sunday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Sunday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Sunday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Sunday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Sunday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Sunday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Sunday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Sunday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Sunday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Sunday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Sunday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Sunday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Sunday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Sunday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("sun")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Sunday");
        }




        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Monday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Monday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Monday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Monday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Monday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Monday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Monday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Monday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Monday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Monday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Monday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Monday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Monday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Monday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Monday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Monday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Monday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Monday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Monday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Monday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Monday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Monday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Monday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Monday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Monday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Monday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Monday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Monday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Monday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Monday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Monday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Monday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Monday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Monday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Monday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Monday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Monday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Monday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Monday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Monday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Monday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Monday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Monday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Monday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Monday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Monday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Monday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Monday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Monday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Monday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Monday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Monday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Monday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Monday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Monday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Monday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Monday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Monday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Monday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Monday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Monday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Monday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Monday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Monday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Monday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Monday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Monday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Monday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Monday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Monday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Monday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Monday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Monday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Monday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Monday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Monday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Monday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Monday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Monday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Monday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Monday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Monday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Monday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("mon")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Monday");
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Tuesday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Tuesday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Tuesday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Tuesday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Tuesday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Tuesday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Tuesday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Tuesday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Tuesday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Tuesday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Tuesday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Tuesday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Tuesday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Tuesday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Tuesday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Tuesday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Tuesday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Tuesday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Tuesday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Tuesday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Tuesday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Tuesday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Tuesday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("tue")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Tuesday");
        }



        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Wednesday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Wednesday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Wednesday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Wednesday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Wednesday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Wednesday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Wednesday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Wednesday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Wednesday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Wednesday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Wednesday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Wednesday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Wednesday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Wednesday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Wednesday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Wednesday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Wednesday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Wednesday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Wednesday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Wednesday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Wednesday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Wednesday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Wednesday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("wed")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Wednesday");
        }


        // ICE

        else if (Dep.equals("ICE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Thursday");
        }else if(Dep.equals("ICE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("ICE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("ICE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Thursday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Thursday");
        }else if(Dep.equals("EEE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("EEE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("EEE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Thursday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Thursday");
        }else if(Dep.equals("CSE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("CSE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("CSE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Thursday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Thursday");
        }else if(Dep.equals("ETE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("ETE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("ETE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Thursday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Thursday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Thursday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Thursday");
        }else if(Dep.equals("Arch") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("Arch") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("Arch") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Thursday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Thursday");
        }else if(Dep.equals("URP") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("URP") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("URP") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Thursday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Thursday");
        }else if(Dep.equals("CHE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("CHE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("CHE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Thursday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Thursday");
        }else if(Dep.equals("PHY") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("PHY") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("PHY") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Thursday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Thursday");
        }else if(Dep.equals("MAT") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("MAT") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("MAT") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Thursday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Thursday");
        }else if(Dep.equals("STAT") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("STAT") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("STAT") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Thursday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Thursday");
        }else if(Dep.equals("GE") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("GE") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("GE") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Thursday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Thursday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Thursday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Thursday");
        }else if(Dep.equals("BBA") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("BBA") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("BBA") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Thursday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Thursday");
        }else if(Dep.equals("THM") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("THM") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("THM") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Thursday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Thursday");
        }else if(Dep.equals("ECO") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("ECO") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("ECO") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Thursday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Thursday");
        }else if(Dep.equals("BAN") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("BAN") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("BAN") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Thursday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Thursday");
        }else if(Dep.equals("SW") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("SW") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("SW") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Thursday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Thursday");
        }else if(Dep.equals("ENG") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("ENG") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("ENG") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Thursday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Thursday");
        }else if(Dep.equals("PA") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("PA") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("PA") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Thursday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Thursday");
        }else if(Dep.equals("HBS") && Sem.equals("2y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Thursday");
        }else if(Dep.equals("HBS") && Sem.equals("3y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Thursday");
        }else if(Dep.equals("HBS") && Sem.equals("4y") && day.equals("thu")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Thursday");
        }


        else {
            reference= FirebaseDatabase.getInstance().getReference("Routines");
        }



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
