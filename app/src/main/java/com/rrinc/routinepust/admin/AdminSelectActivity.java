package com.rrinc.routinepust.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.Admin;

public class AdminSelectActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    String dep, sem;
    TextView tvs,tvd;
    FloatingActionButton fab;

    FirebaseUser firebaseUser;

    @Override
    protected void onStart() {
        super.onStart();

        Admin admin = new Admin(AdminSelectActivity.this);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        // cheack if user not fund or fund
        if(firebaseUser !=null && admin.getAdept()!="" && admin.getAseme()!=""){
            Intent intent = new Intent(AdminSelectActivity.this,AdminDashBoard.class);
            intent.putExtra("dep",admin.getAdept());
            intent.putExtra("sem",admin.getAseme());
            startActivity(intent);
            finish();
        }
    }



    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_select);

        tvs = (TextView) findViewById(R.id.sem);
        tvd =(TextView)findViewById(R.id.dept);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setVisibility(View.GONE);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNext(dep,sem);
            }
        });

    }

    private void goNext(String dep, String sem) {
        Intent intent = new Intent(AdminSelectActivity.this,LoginActivity.class);
        Admin admin = new Admin(AdminSelectActivity.this);
        admin.setAdept(dep);
        admin.setAseme(sem);
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

    @SuppressLint("RestrictedApi")
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
                fab.setVisibility(View.VISIBLE);
                return true;
            case R.id.sem2:
                sem = "2y";
                tvs.setText("2nd Year");
                fab.setVisibility(View.VISIBLE);
                return true;
            case R.id.sem3:
                sem = "3y";
                tvs.setText("3rd Year");
                fab.setVisibility(View.VISIBLE);
                return true;
            case R.id.sem4:
                sem = "4y";
                tvs.setText("4th Year");
                fab.setVisibility(View.VISIBLE);
                return true;
            default:
                return false;
        }
    }

}
