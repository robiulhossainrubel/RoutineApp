package com.rrinc.routinepust.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.rrinc.routinepust.R;
import com.rrinc.routinepust.utils.RecycleViewAdapter;
import com.rrinc.routinepust.model.RoutineInfo;

import java.util.ArrayList;
import java.util.List;


public class FragmentSaturday extends Fragment {

    View view;
    DatabaseReference reference;

    private RecyclerView recyclerView;

    private RecycleViewAdapter routineAdapter;
    private List<RoutineInfo> routineList;

    public FragmentSaturday() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.saturday_fragment, container, false);

        recyclerView =(RecyclerView) view.findViewById(R.id.saturday_recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Bundle bundle = getArguments();
        String dep = bundle.getString("dept");
        String sem = bundle.getString("seme");

        routineList = new ArrayList<>();


        readSat(dep,sem);

        return view;
    }

    private void readSat(String Dep, String Sem) {


        // ICE

        if (Dep.equals("ICE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ICE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ICE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ICE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ICE").child("4th_Year").child("Saturday");
        }


        // EEE

        else if (Dep.equals("EEE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("EEE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("EEE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("EEE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("EEE").child("4th_Year").child("Saturday");
        }


        // CSE

        else if (Dep.equals("CSE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("CSE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("CSE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("CSE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CSE").child("4th_Year").child("Saturday");
        }


        // ETE

        else if (Dep.equals("ETE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ETE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ETE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ETE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ETE").child("4th_Year").child("Saturday");
        }


        // CIVIL

        else if (Dep.equals("CIVIL") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("1st_Year").child("Saturday");
        }else if(Dep.equals("CIVIL") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("CIVIL") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("CIVIL") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CIVIL").child("4th_Year").child("Saturday");
        }



        // Arch

        else if (Dep.equals("Arch") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("1st_Year").child("Saturday");
        }else if(Dep.equals("Arch") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("Arch") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("Arch") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("Arch").child("4th_Year").child("Saturday");
        }



        // URP

        else if (Dep.equals("URP") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("1st_Year").child("Saturday");
        }else if(Dep.equals("URP") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("URP") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("URP") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("URP").child("4th_Year").child("Saturday");
        }




        // CHE

        else if (Dep.equals("CHE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("CHE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("CHE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("CHE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("CHE").child("4th_Year").child("Saturday");
        }



        // PHY

        else if (Dep.equals("PHY") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("1st_Year").child("Saturday");
        }else if(Dep.equals("PHY") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("PHY") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("PHY") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHY").child("4th_Year").child("Saturday");
        }


        // MAT

        else if (Dep.equals("MAT") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("1st_Year").child("Saturday");
        }else if(Dep.equals("MAT") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("MAT") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("MAT") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("MAT").child("4th_Year").child("Saturday");
        }


        // STAT

        else if (Dep.equals("STAT") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("1st_Year").child("Saturday");
        }else if(Dep.equals("STAT") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("STAT") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("STAT") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("STAT").child("4th_Year").child("Saturday");
        }



        // GE

        else if (Dep.equals("GE") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("1st_Year").child("Saturday");
        }else if(Dep.equals("GE") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("GE") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("GE") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("GE").child("4th_Year").child("Saturday");
        }



        // PHARM

        else if (Dep.equals("PHARM") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("1st_Year").child("Saturday");
        }else if(Dep.equals("PHARM") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("PHARM") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("PHARM") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PHARM").child("4th_Year").child("Saturday");
        }



        // BBA

        else if (Dep.equals("BBA") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("1st_Year").child("Saturday");
        }else if(Dep.equals("BBA") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("BBA") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("BBA") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BBA").child("4th_Year").child("Saturday");
        }


        // THM

        else if (Dep.equals("THM") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("1st_Year").child("Saturday");
        }else if(Dep.equals("THM") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("THM") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("THM") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("THM").child("4th_Year").child("Saturday");
        }


        // ECO

        else if (Dep.equals("ECO") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ECO") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ECO") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ECO") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ECO").child("4th_Year").child("Saturday");
        }


        // BAN

        else if (Dep.equals("BAN") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("1st_Year").child("Saturday");
        }else if(Dep.equals("BAN") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("BAN") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("BAN") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("BAN").child("4th_Year").child("Saturday");
        }


        // SW

        else if (Dep.equals("SW") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("1st_Year").child("Saturday");
        }else if(Dep.equals("SW") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("SW") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("SW") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("SW").child("4th_Year").child("Saturday");
        }



        // ENG

        else if (Dep.equals("ENG") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("1st_Year").child("Saturday");
        }else if(Dep.equals("ENG") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("ENG") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("ENG") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("ENG").child("4th_Year").child("Saturday");
        }


        // PA

        else if (Dep.equals("PA") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("1st_Year").child("Saturday");
        }else if(Dep.equals("PA") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("PA") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("PA") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("PA").child("4th_Year").child("Saturday");
        }


        // HBS

        else if (Dep.equals("HBS") && Sem.equals("1y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("1st_Year").child("Saturday");
        }else if(Dep.equals("HBS") && Sem.equals("2y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("2nd_Year").child("Saturday");
        }else if(Dep.equals("HBS") && Sem.equals("3y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("3rd_Year").child("Saturday");
        }else if(Dep.equals("HBS") && Sem.equals("4y")){
            reference= FirebaseDatabase.getInstance().getReference("Routine").child("HBS").child("4th_Year").child("Saturday");
        }




        else {
            reference= FirebaseDatabase.getInstance().getReference("Routines");
        }

        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                routineList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    RoutineInfo routine = snapshot.getValue(RoutineInfo.class);


                    routineList.add(routine);

                }
                routineAdapter = new RecycleViewAdapter(getContext(), routineList);
                recyclerView.setAdapter(routineAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(getContext(), "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

