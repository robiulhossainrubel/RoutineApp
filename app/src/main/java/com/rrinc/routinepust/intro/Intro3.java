package com.rrinc.routinepust.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.rrinc.routinepust.R;
import com.rrinc.routinepust.activities.DrawerActivity;

public class Intro3 extends AppCompatActivity {

    TextView back,get;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro3);

        final String dep = getIntent().getStringExtra("dep");
        final String sem = getIntent().getStringExtra("sem");

        get = (TextView) findViewById(R.id.btn);
        back = (TextView) findViewById(R.id.back);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        get.setAnimation(frombottom);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intro3.this, SelectActivity.class);
                startActivity(intent);
                finish();
            }
        });

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intro3.this, DrawerActivity.class);
                intent.putExtra("dep",dep);
                intent.putExtra("sem",sem);
                startActivity(intent);
                finish();
            }
        });
    }
}
