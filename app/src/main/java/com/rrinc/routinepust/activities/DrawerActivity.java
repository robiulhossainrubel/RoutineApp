package com.rrinc.routinepust.activities;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.admin.AdminSelectActivity;
import com.rrinc.routinepust.fragments.FragmentFriday;
import com.rrinc.routinepust.fragments.FragmentMonday;
import com.rrinc.routinepust.fragments.FragmentSaturday;
import com.rrinc.routinepust.fragments.FragmentSunday;
import com.rrinc.routinepust.fragments.FragmentThursday;
import com.rrinc.routinepust.fragments.FragmentTuesday;
import com.rrinc.routinepust.fragments.FragmentWednesday;
import com.rrinc.routinepust.service.AlarmReciver;
import com.rrinc.routinepust.utils.ViewPageAdapter;

import java.util.Calendar;

public class DrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    String dep,sem;

    public DrawerActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        registerAlarm();

        dep = getIntent().getStringExtra("dep");
        sem = getIntent().getStringExtra("sem");

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Classes");
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        Bundle bundle = new Bundle();
        bundle.putString("dept",dep);
        bundle.putString("seme",sem);

        tabLayout= findViewById(R.id.tablayout_id);

        viewPager= findViewById(R.id.viewpager_id);
        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());

        FragmentSaturday fragmentSaturday = new FragmentSaturday();
        fragmentSaturday.setArguments(bundle);
        adapter.AddFragment(fragmentSaturday,"Saturday");

        FragmentSunday fragmentSunday = new FragmentSunday();
        fragmentSunday.setArguments(bundle);
        adapter.AddFragment(fragmentSunday,"Sunday");

        FragmentMonday fragmentMonday = new FragmentMonday();
        fragmentMonday.setArguments(bundle);
        adapter.AddFragment(fragmentMonday,"Monday");

        FragmentTuesday fragmentTuesday = new FragmentTuesday();
        fragmentTuesday.setArguments(bundle);
        adapter.AddFragment(fragmentTuesday,"Tuesday");

        FragmentWednesday fragmentWednesday = new FragmentWednesday();
        fragmentWednesday.setArguments(bundle);
        adapter.AddFragment(fragmentWednesday,"Wednesday");

        FragmentThursday fragmentThursday = new FragmentThursday();
        fragmentThursday.setArguments(bundle);
        adapter.AddFragment(fragmentThursday,"Thursday");

        FragmentFriday fragmentFriday = new FragmentFriday();
        fragmentFriday.setArguments(bundle);
        adapter.AddFragment(fragmentFriday,"Friday");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void registerAlarm() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,16);
        calendar.set(Calendar.MINUTE,16);
        calendar.set(Calendar.SECOND,0);

        Intent intent =new Intent(DrawerActivity.this, AlarmReciver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(DrawerActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager am = (AlarmManager)this.getSystemService(ALARM_SERVICE);
        assert am != null;
        am.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.rtAdd) {


        }else if (id == R.id.searchMenu) {
            Intent intent = new Intent(DrawerActivity.this, SearchActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_setting) {

        } else if (id == R.id.nav_ct) {

            Intent intent = new Intent(DrawerActivity.this, CtActivity.class);

            intent.putExtra("dep",dep);
            intent.putExtra("sem",sem);
            startActivity(intent);

        } else if (id == R.id.nav_share) {

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String sub="ClassManager";
            String body="This app help to find your Class Routine,Class announcement and so on.\n com.rrinc.pustice";
            intent.putExtra(Intent.EXTRA_SUBJECT,sub);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share With"));

        } else if (id == R.id.nav_announce) {

            Intent intent = new Intent(DrawerActivity.this, AnnouncementActivity.class);

            intent.putExtra("dep",dep);
            intent.putExtra("sem",sem);
            startActivity(intent);

        } else if (id == R.id.nav_pblm) {

            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rubel.ice.pust@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feed back from ClassManager");
                intent.putExtra(Intent.EXTRA_TEXT, "Name : \n\nMessage : ");
                startActivity(Intent.createChooser(intent, "Choose an email client : "));

            } catch (Exception e) {

                Toast.makeText(getApplicationContext(),"Exception : "+e,Toast.LENGTH_SHORT).show();

            }

        } else if (id == R.id.nav_admin){

            Intent intent = new Intent(DrawerActivity.this, AdminSelectActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_about){
            Intent intent = new Intent(DrawerActivity.this,AboutActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
