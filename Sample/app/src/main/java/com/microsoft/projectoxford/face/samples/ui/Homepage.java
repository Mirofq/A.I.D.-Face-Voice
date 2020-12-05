package com.microsoft.projectoxford.face.samples.ui;
import android.content.Intent;
import android.speech.tts.Voice;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.depressiontest.StartActivity;
import com.microsoft.projectoxford.face.samples.R;

public class Homepage extends AppCompatActivity {

    Button StartFace;
    Button StartVoice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);


        StartFace = (Button)findViewById(R.id.MulaiFace);
        StartFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), StartActivityFace.class);


                startActivity(i);
            }
        });

        StartVoice = (Button)findViewById(R.id.MulaiVoice);
        StartVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), StartActivity.class);


                startActivity(i);
            }
        });




    }
}