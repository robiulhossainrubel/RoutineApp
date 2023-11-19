package com.rrinc.routinepust.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.CT;
import com.rrinc.routinepust.utils.CTAdapter;

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

        recyclerView = findViewById(R.id.ctpost);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);


        ctList = new ArrayList<>();

        assert dept != null;
        readPost(dept, see);
    }

    private void readPost(String Dep, String Sem) {



        // ICE

        reference= FirebaseDatabase.getInstance().getReference("ClassTest").child(Dep).child(Sem);

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
