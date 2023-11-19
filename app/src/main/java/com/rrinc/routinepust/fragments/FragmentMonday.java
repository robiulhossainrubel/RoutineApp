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


public class FragmentMonday extends Fragment {

    View view;
    DatabaseReference reference;

    private RecyclerView recyclerView;

    private RecycleViewAdapter routineAdapter;
    private List<RoutineInfo> routineList;


    public FragmentMonday() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.monday_fragment,container,false);

        recyclerView =(RecyclerView) view.findViewById(R.id.monday_recy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Bundle bundle = getArguments();
        String dep = bundle.getString("dept");
        String sem = bundle.getString("seme");

        routineList = new ArrayList<>();


        readMon(dep,sem);


        return view;
    }

    private void readMon(String Dep, String Sem) {

// ICE

        reference= FirebaseDatabase.getInstance().getReference("Routine").child(Dep).child(Sem).child("mon");

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
