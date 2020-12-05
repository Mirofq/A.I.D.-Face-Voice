package com.example.android.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
//import com.microsoft.projectoxford.face.samples.ui.Homepage;
import com.example.android.depressiontest.VoiceActivity;

public class StartActivity extends AppCompatActivity {
    

        EditText UserName;

        RadioButton Male;
        RadioButton Female;
        RadioButton Age1;
        RadioButton Age2;
        RadioButton Age3;
        RadioButton Age4;
        RadioButton Age5;
        RadioButton Age6;
        TextView Age;
        Button SubmitButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(com.example.android.depressiontest.R.layout.activity_start);

            UserName = (EditText) findViewById(com.example.android.depressiontest.R.id.Username);
            Male = findViewById(com.example.android.depressiontest.R.id.male);
            Female = findViewById(com.example.android.depressiontest.R.id.female);
            Age1 = findViewById(com.example.android.depressiontest.R.id.usia1);
            Age2 = findViewById(com.example.android.depressiontest.R.id.usia2);
            Age3 = findViewById(com.example.android.depressiontest.R.id.usia3);
            Age4 = findViewById(com.example.android.depressiontest.R.id.usia4);
            Age5 = findViewById(com.example.android.depressiontest.R.id.usia5);
            Age6 = findViewById(com.example.android.depressiontest.R.id.usia6);
            SubmitButton = (Button)findViewById(com.example.android.depressiontest.R.id.btnSubmit);
            Age2.setChecked(true);

            Male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Male.isChecked()==true){
                        Female.setChecked(false);
                    }
                }
            });

            Female.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Female.isChecked()==true){
                        Male.setChecked(false);
                    }
                }
            });


            Age1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Age1.isChecked()==true){
                        Age2.setChecked(false);
                        Age3.setChecked(false);
                        Age4.setChecked(false);
                        Age5.setChecked(false);
                        Age6.setChecked(false);
                    }
                }
            });

            Age2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Age2.isChecked()==true){
                        Age1.setChecked(false);
                        Age3.setChecked(false);
                        Age4.setChecked(false);
                        Age5.setChecked(false);
                        Age6.setChecked(false);
                    }
                }
            });

            Age3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Age3.isChecked()==true){
                        Age2.setChecked(false);
                        Age1.setChecked(false);
                        Age4.setChecked(false);
                        Age5.setChecked(false);
                        Age6.setChecked(false);
                    }
                }
            });

            Age4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Age4.isChecked()==true){
                        Age2.setChecked(false);
                        Age3.setChecked(false);
                        Age1.setChecked(false);
                        Age5.setChecked(false);
                        Age6.setChecked(false);
                    }
                }
            });

            Age5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Age5.isChecked()==true){
                        Age2.setChecked(false);
                        Age3.setChecked(false);
                        Age4.setChecked(false);
                        Age1.setChecked(false);
                        Age6.setChecked(false);
                    }
                }
            });

            Age6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Age6.isChecked()==true){
                        Age2.setChecked(false);
                        Age3.setChecked(false);
                        Age4.setChecked(false);
                        Age5.setChecked(false);
                        Age1.setChecked(false);
                    }
                }
            });



            SubmitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (UserName.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),
                                "Please insert your name.",
                                Toast.LENGTH_SHORT).show();
                    }
                    //else if (Sex.getText().toString().equals("")){
                    //Toast.makeText(getApplicationContext(),
                    //"Please insert your gender.",
                    //Toast.LENGTH_SHORT).show();
                    //}
                    else {
                        Intent i=new Intent(getApplicationContext(), VoiceActivity.class);
                        i.putExtra("NamaUser", UserName.getText().toString());
                        startActivity(i);
                    }


                    Intent i=new Intent(getApplicationContext(), ResultActivity.class);
                    i.putExtra("NamaUser", UserName.getText().toString());


                }
            });

        }
    }

