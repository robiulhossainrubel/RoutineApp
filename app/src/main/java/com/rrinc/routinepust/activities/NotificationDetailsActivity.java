package com.rrinc.routinepust.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.rrinc.routinepust.R;

public class NotificationDetailsActivity extends AppCompatActivity {

    TextView textViewNotificationDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_details);

        textViewNotificationDetails =  (TextView)findViewById(R.id.textViewNotificationDetails);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        textViewNotificationDetails.setText(intent.getStringExtra("count"));
    }
}
