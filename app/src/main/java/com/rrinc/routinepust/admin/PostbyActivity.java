package com.rrinc.routinepust.admin;

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
import com.rrinc.routinepust.model.Post;
import com.rrinc.routinepust.utils.PostRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

public class PostbyActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PostRecycleAdapter adapter;
    List<Post> postList;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postby);

        final String dept = getIntent().getStringExtra("dep");
        final String seme = getIntent().getStringExtra("sem");

        recyclerView =(RecyclerView)findViewById(R.id.adminpost);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        postList = new ArrayList<>();
        readData(dept,seme);
    }

    private void readData(String Dep ,String Sem) {

        // ICE

        reference= FirebaseDatabase.getInstance().getReference("Post").child(Dep).child(Sem);

        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                postList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Post routine = snapshot.getValue(Post.class);


                    postList.add(routine);

                }
                adapter = new PostRecycleAdapter(getApplicationContext(), postList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(getApplicationContext(), "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
