package com.rrinc.routinepust.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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

        card1 = (CardView)findViewById(R.id.rotCard);
        card2 = (CardView)findViewById(R.id.anCard);
        card3 = (CardView)findViewById(R.id.srCard);
        card4 = (CardView)findViewById(R.id.spCard);
        log = (ImageView)findViewById(R.id.userpic);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        final String dept = getIntent().getStringExtra("dep");
        final String seme = getIntent().getStringExtra("sem");


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AdminDashBoard.this, AddRoutineAdminActivity.class);
                intent.putExtra("dep",dept);
                intent.putExtra("sem",seme);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AdminDashBoard.this, AdminAddPostActivity.class);
                intent.putExtra("dep",dept);
                intent.putExtra("sem",seme);
                startActivity(intent);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AdminDashBoard.this, EditRoutineAdminActivity.class);
                intent.putExtra("dep",dept);
                intent.putExtra("sem",seme);
                startActivity(intent);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AdminDashBoard.this, AddCtAdminActivity.class);
                intent.putExtra("dep",dept);
                intent.putExtra("sem",seme);
                startActivity(intent);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(AdminDashBoard.this);

                builder.setMessage("Do You Want To LogOut?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                FirebaseAuth.getInstance().signOut();
                                Intent intent = new Intent(AdminDashBoard.this, AdminSelectActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });

                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });
    }

}
