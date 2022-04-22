package com.rrinc.routinepust.admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Wave;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rrinc.routinepust.R;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    Button btn_login;
    ProgressBar pBar;
    FirebaseAuth auth;

    FirebaseUser firebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();

        email =(EditText) findViewById(R.id.email);
        password =(EditText) findViewById(R.id.password);
        btn_login = (Button)findViewById(R.id.bt_login);
        pBar = (ProgressBar)findViewById(R.id.pbar);
        FoldingCube cubeGrid = new FoldingCube();
        pBar.setIndeterminateDrawable(cubeGrid);
        pBar.setVisibility(View.GONE);

        final String dep = getIntent().getStringExtra("dep");
        final String sem = getIntent().getStringExtra("sem");


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pBar.setVisibility(View.VISIBLE);
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                if(TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                    Toast.makeText(LoginActivity.this,"Fill up all field",Toast.LENGTH_SHORT).show();
                }else {

                    auth.signInWithEmailAndPassword(txt_email,txt_password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        pBar.setVisibility(View.GONE);
                                        Intent intent =new Intent(LoginActivity.this,AdminDashBoard.class);
                                        intent.putExtra("dep",dep);
                                        intent.putExtra("sem",sem);
                                        startActivity(intent);
                                        finish();
                                    }else {
                                        pBar.setVisibility(View.GONE);
                                        Toast.makeText(LoginActivity.this,"Login failed", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });
    }

}
