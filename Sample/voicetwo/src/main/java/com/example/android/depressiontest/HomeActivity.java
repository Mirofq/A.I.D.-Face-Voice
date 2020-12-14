package com.example.android.depressiontest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class HomeActivity extends AppCompatActivity {

    Button StartRecord;
    EditText UserName;
    String Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Nama = getIntent().getStringExtra("nameofuser");

        StartRecord = (Button) findViewById(R.id.btnStart);
        StartRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(getApplicationContext(), VoiceActivity.class);
                v.putExtra("nameofuser", Nama);

                startActivity(v);
            }
        });


    }

}




