package com.rrinc.routinepust.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.RoutineInfo;

public class RoutineDetailsActivity extends AppCompatActivity {

    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_details);

        final String dept = getIntent().getStringExtra("dep");
        final String seme = getIntent().getStringExtra("sem");
        final String daay = getIntent().getStringExtra("day");
        final String ide = getIntent().getStringExtra("id");
        final String ttl = getIntent().getStringExtra("ttl");
        final String cod = getIntent().getStringExtra("cod");
        final String tim = getIntent().getStringExtra("tim");
        final String tec = getIntent().getStringExtra("tch");
        final String rom = getIntent().getStringExtra("rom");



        final EditText titl=(EditText)findViewById(R.id.etctl);
        titl.setText(ttl);
        final EditText code=(EditText)findViewById(R.id.etcc);
        code.setText(cod);
        final EditText time=(EditText)findViewById(R.id.ettime);
        time.setText(tim);
        final EditText tch=(EditText)findViewById(R.id.etti);
        tch.setText(tec);
        final EditText room=(EditText)findViewById(R.id.etroom);
        room.setText(rom);
        Button btn=(Button)findViewById(R.id.bt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cttl=titl.getText().toString();
                String ccode=code.getText().toString();
                String ctime=time.getText().toString();
                String ctch=tch.getText().toString();
                String croom=room.getText().toString();
                update(dept,seme,daay,ide,cttl,ccode,ctime,ctch,croom);
            }
        });
        Button btn2=(Button)findViewById(R.id.del);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete(dept,seme,daay,ide);
            }
        });
    }

    private void delete(String Dep, String Sem, String day, String id) {

        reference= FirebaseDatabase.getInstance().getReference("Routine").child(Dep).child(Sem).child(day).child(id);

        reference.removeValue();
        Toast.makeText(getApplicationContext(),"Successfully Deleted",Toast.LENGTH_SHORT).show();
    }



    private void update(String Dep, String Sem, String day, String id,String titl,String code,String time,String tech,String room){



        // ICE
        reference= FirebaseDatabase.getInstance().getReference("Routine").child(Dep).child(Sem).child(day).child(id);

        RoutineInfo info = new RoutineInfo(id,titl,code,time,tech,room);
        reference.setValue(info);

        Toast.makeText(getApplicationContext(),"Successfully Updated",Toast.LENGTH_SHORT).show();

    }

}
