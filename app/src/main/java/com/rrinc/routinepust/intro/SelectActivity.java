package com.rrinc.routinepust.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.rrinc.routinepust.R;
import com.rrinc.routinepust.activities.DrawerActivity;
import com.rrinc.routinepust.model.User;

public class SelectActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    String dep, sem;
    TextView tvs,tvd,back,done;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_select);

        tvs = (TextView) findViewById(R.id.sem);
        tvd =(TextView)findViewById(R.id.dept);
        done = (TextView) findViewById(R.id.next);
        back = (TextView) findViewById(R.id.back);

        done.setVisibility(View.GONE);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, Intro2.class);
                startActivity(intent);
                finish();
            }
        });


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNext(dep,sem);
            }
        });

    }

    private void goNext(String dep, String sem) {
        Intent intent = new Intent(SelectActivity.this, Intro3.class);
        User user = new User(SelectActivity.this);
        user.setDept(dep);
        user.setSeme(sem);
        intent.putExtra("dep",dep);
        intent.putExtra("sem",sem);
        startActivity(intent);
        finish();
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_department);
        popup.show();
    }

    public void showPopup2(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_sem);
        popup.show();
    }

    @SuppressLint({"RestrictedApi", "NonConstantResourceId", "SetTextI18n"})
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ice:
                dep = "ICE";
                tvd.setText("ICE");
                return true;
            case R.id.eee:
                dep = "EEE";
                tvd.setText("EEE");
                return true;
            case R.id.cse:
                dep = "CSE";
                tvd.setText("CSE");
                return true;
            case R.id.ete:
                dep = "ETE";
                tvd.setText("ETE");
                return true;
            case R.id.civil:
                dep = "CIVIL";
                tvd.setText("CIVIL");
                return true;
            case R.id.arch:
                dep = "Arch";
                tvd.setText("Arch");
                return true;
            case R.id.urp:
                dep = "URP";
                tvd.setText("URP");
                return true;
            case R.id.che:
                dep = "CHE";
                tvd.setText("CHE");
                return true;
            case R.id.phy:
                dep = "PHY";
                tvd.setText("PHY");
                return true;
            case R.id.mat:
                dep = "MAT";
                tvd.setText("MAT");
                return true;
            case R.id.stat:
                dep = "STAT";
                tvd.setText("STAT");
                return true;
            case R.id.ge:
                dep = "GE";
                tvd.setText("GE");
                return true;
            case R.id.pharm:
                dep = "PHARM";
                tvd.setText("PHARM");
                return true;
            case R.id.bba:
                dep = "BBA";
                tvd.setText("BBA");
                return true;
            case R.id.thm:
                dep = "THM";
                tvd.setText("THM");
                return true;
            case R.id.eco:
                dep = "ECO";
                tvd.setText("ECO");
                return true;
            case R.id.ban:
                dep = "BAN";
                tvd.setText("BAN");
                return true;
            case R.id.sw:
                dep = "SW";
                tvd.setText("SW");
                return true;
            case R.id.eng:
                dep = "ENG";
                tvd.setText("ENG");
                return true;
            case R.id.pa:
                dep = "PA";
                tvd.setText("PA");
                return true;
            case R.id.hbs:
                dep = "HBS";
                tvd.setText("HBS");
                return true;
            case R.id.sem1:
                sem = "1y";
                tvs.setText("1st Year");
                done.setVisibility(View.VISIBLE);
                return true;
            case R.id.sem2:
                sem = "2y";
                tvs.setText("2nd Year");
                done.setVisibility(View.VISIBLE);
                return true;
            case R.id.sem3:
                sem = "3y";
                tvs.setText("3rd Year");
                done.setVisibility(View.VISIBLE);
                return true;
            case R.id.sem4:
                sem = "4y";
                tvs.setText("4th Year");
                done.setVisibility(View.VISIBLE);
                return true;
            default:
                return false;
        }

    }


}
