package com.example.android.depressiontest;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ReccomendActivity extends AppCompatActivity {
    TextView Disclaimer;
    TextView WhatIsDepression;
    TextView HotlineNum;
    Button MainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        Disclaimer = findViewById(R.id.infoDisclaimer);
        WhatIsDepression = findViewById(R.id.DefineDepression);
        HotlineNum = findViewById(R.id.contactlist);
        MainMenu = findViewById(R.id.MainMenu);


        Disclaimer.setText("Please note: This self-test is meant to give you insight in your mood state. "+
                "This test is explicitly not suitable for diagnosis.This test cannot replace professional help. When in doubt, please contact your general practitioner." +
                " No rights can be derived from the results of this test.");

        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setComponent(new ComponentName("com.microsoft.projectoxford.face.samples","com.microsoft.projectoxford.face.samples.ui.Homepage"));
                startActivity(intent);

                //Intent i = new Intent(getApplicationContext(),MainActivity.class);
                //startActivity(i);
            }
        });
    }
    public void browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nimh.nih.gov/health/publications/depression/index.shtml#pub6"));
        startActivity(browserIntent);
    }

    public void browser2(View view){
        Intent browser2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moodjuice.scot.nhs.uk/depression.asp"));
        startActivity(browser2Intent);
    }

    public void browser3(View view){
        Intent browser3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aia.com.my/en/what-matters/seetheotherside/mental-health-helpline-resources.html"));
        startActivity(browser3Intent);
    }



}
