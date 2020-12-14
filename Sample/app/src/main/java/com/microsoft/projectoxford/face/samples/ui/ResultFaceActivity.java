package com.microsoft.projectoxford.face.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class ResultFaceActivity extends AppCompatActivity {

    TextView TestResult;
    TextView Disclaimer;
    Button viewRec;
    int nilaiInt;
    //ImageView ScoreRange;
    String getName;
    String getEmo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.depressiontest.R.layout.activity_result);

        TestResult = (TextView) findViewById(com.example.android.depressiontest.R.id.TestResult);
        Disclaimer = (TextView) findViewById(com.example.android.depressiontest.R.id.Disclaimer);
        //ScoreRange = (ImageView) findViewById(com.example.android.depressiontest.R.id.ScoreRange);

        //MainMenu = findViewById(R.id.ButtonMenu);

        getName = getIntent().getStringExtra("nameofuser");
        nilaiInt = getIntent().getIntExtra("nilai", 0);
        getEmo = getIntent().getStringExtra("voiceemotion");

        //Neutral
        if (nilaiInt <= 4 && "Neutral".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "Neutral".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 14 && "Neutral".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please contact recommended hotline numbers if your symptoms worsen and affects your daily activities.");
        } else if (nilaiInt <= 22 && "Neutral".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt > 22 && "Neutral".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        }

        //Happiness
        if (nilaiInt <= 4 && "Happiness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "Happiness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 14 && "Happiness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 22 && "Happiness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt > 22 && "Happiness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        }


        //Sadness
        if (nilaiInt <= 4 && "Sadness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "Sadness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 14 && "Sadness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt <= 22 && "Sadness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate to Severe Depression"+
                    "\n\n\n This indicates that you may have moderate to severe depression. We gladly suggest you to seek active treatment with medication and/or therapy.");
        } else if (nilaiInt > 22 && "Sadness".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Severe Depression"+
                    "\n\n\n This indicates that you may have severe depression. We gladly suggest you to refer yourself to mental health specialist.");
        }

        //Anger
        if (nilaiInt <= 4 && "Anger".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "Anger".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 14 && "Anger".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt <= 22 && "Anger".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate to Severe Depression"+
                    "\n\n\n This indicates that you may have moderate to severe depression. We gladly suggest you to seek active treatment with medication and/or therapy.");
        } else if (nilaiInt > 22 && "Anger".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Severe Depression"+
                    "\n\n\n This indicates that you may have severe depression. We gladly suggest you to refer yourself to mental health specialist.");
        }

        //Fear
        if (nilaiInt <= 4 && "Fear".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n  Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: No Depression"+
                    "\n\n\n This indicates that you have no depression.");
        } else if (nilaiInt <= 9 && "Fear".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Mild Depression"+
                    "\n\n\n This indicates that you may have mild depression. Please do recommended self-treatment activities and contact recommended hotline numbers if your symptoms worsen.");
        } else if (nilaiInt <= 14 && "Fear".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate Depression"+
                    "\n\n\n This indicates that you may have moderate depression. We gladly suggest you to get counselling and/or therapy.");
        } else if (nilaiInt <= 22 && "Fear".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Moderate to Severe Depression"+
                    "\n\n\n This indicates that you may have moderate to severe depression. We gladly suggest you to seek active treatment with medication and/or therapy.");
        } else if (nilaiInt > 22 && "Fear".equals(getEmo)) {
            TestResult.setText("\n Hi " + getName + "\n\n\n\n\n Face Emotion: " + getEmo + "\n PHQ-9 Questionnaire Score: " + nilaiInt +
                    "\n Total Result: Severe Depression"+
                    "\n\n\n This indicates that you may have severe depression. We gladly suggest you to refer yourself to mental health specialist.");
        }

        //Disclaimer.setText("PHQ-9, Patient Health Questionnaire 9:-" + " Developed by Drs Robert L Spitzer, Janet B.W. Williams, Kurt Kroenke and colleages, with an educational grant from Pfizer Inc."
        //+ " No permission required to reproduce, translate, display or contribute.");


        viewRec = (Button) findViewById(com.example.android.depressiontest.R.id.recList);
        viewRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getApplicationContext(), Recommendation.class);


                startActivity(r);
            }
        });

    }
}
