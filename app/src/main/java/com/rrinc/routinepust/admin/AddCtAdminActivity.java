package com.rrinc.routinepust.admin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.CT;

public class AddCtAdminActivity extends AppCompatActivity {

    EditText ttl,cod,tim,tec,rom,date,topic;
    Button btn;
    FirebaseUser user;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addct_admin);

        ttl = findViewById(R.id.etctl);
        cod = findViewById(R.id.etcc);
        tim = findViewById(R.id.ettime);
        tec = findViewById(R.id.etti);
        rom = findViewById(R.id.etroom);
        date = findViewById(R.id.etdate);
        topic = findViewById(R.id.ettopic);

        btn = findViewById(R.id.bt);

        user = FirebaseAuth.getInstance().getCurrentUser();

        final String dep = getIntent().getStringExtra("dep");
        final String sem = getIntent().getStringExtra("sem");

        btn.setOnClickListener(v -> {
            assert dep != null;
            saveData(dep,sem);
        });
    }

    private void saveData(String Dep, String Sem) {
        // ICE

        reference= FirebaseDatabase.getInstance().getReference("ClassTest").child(Dep).child(Sem);

        String key = reference.push().getKey();
        String titel = ttl.getText().toString();
        String code = cod.getText().toString();
        String time = tim.getText().toString();
        String tech = tec.getText().toString();
        String room = rom.getText().toString();
        String dat = date.getText().toString();
        String top = topic.getText().toString();

        CT info = new CT(titel,code,top,tech,dat,room,time,key);
        assert key != null;
        reference.child(key).setValue(info);
        Toast.makeText(getApplicationContext(),"CT added successfully",Toast.LENGTH_SHORT).show();

    }
}
