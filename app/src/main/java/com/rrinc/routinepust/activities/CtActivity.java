package com.rrinc.routinepust.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.CT;
import com.rrinc.routinepust.model.Post;
import com.rrinc.routinepust.utils.CTAdapter;
import com.rrinc.routinepust.utils.PostRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

public class CtActivity extends AppCompatActivity {

    LinearLayoutManager layoutManager;
    DatabaseReference reference;
    RecyclerView recyclerView;
    CTAdapter ctAdapter;
    List<CT> ctList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct);

        final String dept = getIntent().getStringExtra("dep");
        final String see = getIntent().getStringExtra("sem");

        recyclerView = (RecyclerView) findViewById(R.id.ctpost);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);


        ctList = new ArrayList<>();

        readPost(dept, see);
    }

    private void readPost(String Dep, String Sem) {



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

        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ctList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    CT ct = snapshot.getValue(CT.class);


                    ctList.add(ct);

                }
                ctAdapter = new CTAdapter(getApplicationContext(), ctList);
                recyclerView.setAdapter(ctAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(getApplicationContext(), "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
