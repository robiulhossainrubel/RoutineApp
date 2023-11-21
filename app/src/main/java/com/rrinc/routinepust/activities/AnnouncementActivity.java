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
import com.rrinc.routinepust.model.Post;
import com.rrinc.routinepust.utils.PostRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementActivity extends AppCompatActivity {


    LinearLayoutManager layoutManager;
    DatabaseReference reference;
    RecyclerView recyclerView;
    PostRecycleAdapter adapter;
    List<Post> postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);

        final String dept = getIntent().getStringExtra("dep");
        final String see = getIntent().getStringExtra("sem");

        recyclerView = findViewById(R.id.announ_recy);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);


        postList = new ArrayList<>();

        assert dept != null;
        readPost(dept, see);
    }


    private void readPost(String Dep, String Sem) {



        // ICE
        reference= FirebaseDatabase.getInstance().getReference("Post").child(Dep).child(Sem);


        reference.keepSynced(true);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                postList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Post post = snapshot.getValue(Post.class);


                    postList.add(post);

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
