package com.rrinc.routinepust.admin;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rrinc.routinepust.R;

public class AdminDashBoard extends AppCompatActivity {


    ImageView log;

    CardView card1,card2,card3,card4;

    FirebaseUser firebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_dash_board);

        card1 = findViewById(R.id.rotCard);
        card2 = findViewById(R.id.anCard);
        card3 = findViewById(R.id.srCard);
        card4 = findViewById(R.id.spCard);
        log = findViewById(R.id.userpic);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        final String dept = getIntent().getStringExtra("dep");
        final String seme = getIntent().getStringExtra("sem");


        card1.setOnClickListener(v -> {
            Intent intent =new Intent(AdminDashBoard.this, AddRoutineAdminActivity.class);
            intent.putExtra("dep",dept);
            intent.putExtra("sem",seme);
            startActivity(intent);
        });

        card2.setOnClickListener(v -> {
            Intent intent =new Intent(AdminDashBoard.this, AdminAddPostActivity.class);
            intent.putExtra("dep",dept);
            intent.putExtra("sem",seme);
            startActivity(intent);
        });
        card3.setOnClickListener(v -> {
            Intent intent =new Intent(AdminDashBoard.this, EditRoutineAdminActivity.class);
            intent.putExtra("dep",dept);
            intent.putExtra("sem",seme);
            startActivity(intent);
        });
        card4.setOnClickListener(v -> {
            Intent intent =new Intent(AdminDashBoard.this, AddCtAdminActivity.class);
            intent.putExtra("dep",dept);
            intent.putExtra("sem",seme);
            startActivity(intent);
        });

        log.setOnClickListener(v -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(AdminDashBoard.this);

            builder.setMessage("Do You Want To LogOut?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", (dialog, which) -> {

                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(AdminDashBoard.this, AdminSelectActivity.class);
                        startActivity(intent);
                        finish();
                    })

                    .setNegativeButton("No", (dialog, which) -> dialog.cancel());

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
        });
    }

}
