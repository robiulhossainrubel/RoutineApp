package com.rrinc.routinepust.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.ybq.android.spinkit.style.CubeGrid;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.activities.DrawerActivity;
import com.rrinc.routinepust.model.User;

public class Splash extends AppCompatActivity {

    TextView tv;
    ImageView im;
    private int prog;
    Animation frombottom,fromtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        tv=(TextView)findViewById(R.id.txt);
        im=(ImageView)findViewById(R.id.img);

        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        tv.setAnimation(frombottom);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.fromtop);
        im.setAnimation(fromtop);


        final User user =new User(Splash.this);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                if (user.getDept()!="" && user.getSeme()!=""){
                    Intent intent=new Intent(Splash.this, DrawerActivity.class);
                    intent.putExtra("dep",user.getDept());
                    intent.putExtra("sem",user.getSeme());
                    startActivity(intent);
                    finish();
                }
                else {
                    startApp();
                }

            }
        });

        thread.start();
    }

    public void dowork(){
        for (prog=50;prog<=100;prog=prog+50) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void startApp(){
        Intent intent=new Intent(Splash.this, IntroActivity.class);
        startActivity(intent);
        finish();
    }
}

