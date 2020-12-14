package com.example.android.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

//import junit.framework.Test;

public class ResultActivity extends AppCompatActivity {
    TextView TestResult;
    TextView Disclaimer;
    Button viewRec;
    int nilaiInt;
    ImageView ScoreRange;
    String getName;
    String VoiceEmo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TestResult = (TextView) findViewById(R.id.TestResult);
        Disclaimer = (TextView) findViewById(R.id.Disclaimer);
        //ScoreRange = (ImageView) findViewById(R.id.ScoreRange);

        //MainMenu = findViewById(R.id.ButtonMenu);

        getName = getIntent().getStringExtra("nameofuser");
        nilaiInt = getIntent().getIntExtra("nilai", 0);
        VoiceEmo = getIntent().getStringExtra("voiceemotion");

        //Neutrality
        if (nilaiInt <= 4 && "neutrality".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "neutrality".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 14 && "neutrality".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please contact recommended hotline numbers if your symptoms worsen and affects your daily activities.");
        } else if (nilaiInt <= 22 && "neutrality".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt > 22 && "neutrality".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        }


        //Happiness
        if (nilaiInt <= 4 && "happiness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "happiness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 14 && "happiness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please contact recommended hotline numbers if your symptoms worsen and affects your daily activities.");
        } else if (nilaiInt <= 22 && "happiness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt > 22 && "happiness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Voice Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        }


        //Sadness
        if (nilaiInt <= 4 && "sadness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "sadness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 14 && "sadness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt <= 22 && "sadness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate to Severe Depression"+
                    "\n\n\n This indicates that you may have moderate to severe depression. We gladly suggest you to seek active treatment with medication and/or therapy.");
        } else if (nilaiInt > 22 && "sadness".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Severe Depression"+
                    "\n\n\n This indicates that you may have severe depression. We gladly suggest you to refer yourself to mental health specialist.");
        }

        //Anger
        if (nilaiInt <= 4 && "anger".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "anger".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 14 && "anger".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt <= 22 && "anger".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate to Severe Depression"+
                    "\n\n\n This indicates that you may have moderate to severe depression. We gladly suggest you to seek active treatment with medication and/or therapy.");
        } else if (nilaiInt > 22 && "anger".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Severe Depression"+
                    "\n\n\n This indicates that you may have severe depression. We gladly suggest you to refer yourself to mental health specialist.");
        }

        //Fear
        if (nilaiInt <= 4 && "fear".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "fear".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 14 && "fear".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt <= 22 && "fear".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate to Severe Depression"+
                    "\n\n\n This indicates that you may have moderate to severe depression. We gladly suggest you to seek active treatment with medication and/or therapy.");
        } else if (nilaiInt > 22 && "fear".equals(VoiceEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + VoiceEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Severe Depression"+
                    "\n\n\n This indicates that you may have severe depression. We gladly suggest you to refer yourself to mental health specialist.");
        }

        //Disclaimer.setText("\nPHQ-9, Patient Health Questionnaire 9:-" + "\nDeveloped by Drs Robert L Spitzer, Janet B.W. Williams, Kurt Kroenke and colleages, with an educational grant from Pfizer Inc."
        // + "\nNo permission required to reproduce, translate, display or contribute.");


        viewRec = (Button) findViewById(R.id.recList);
        viewRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getApplicationContext(), ReccomendActivity.class);


                startActivity(r);
            }
        });
    }
}