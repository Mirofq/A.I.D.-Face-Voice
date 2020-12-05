package com.microsoft.projectoxford.face.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.depressiontest.ReccomendActivity;

public class ResultFaceActivity extends QuestionFaceActivity {

    TextView TestResult;
    TextView Disclaimer;
    Button viewRec;
    int nilaiInt;
    String terimaNama;
    TextView ScoreRange;
    TextView NoDep;
    TextView MildDep;
    TextView ModDep;
    TextView ModSevDep;
    TextView SevDep;
    String getName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.depressiontest.R.layout.activity_result);

        TestResult = (TextView)findViewById(com.example.android.depressiontest.R.id.TestResult);
        Disclaimer = (TextView)findViewById(com.example.android.depressiontest.R.id.Disclaimer);
        ScoreRange = (TextView)findViewById(com.example.android.depressiontest.R.id.ScoreRange);
        NoDep = (TextView)findViewById(com.example.android.depressiontest.R.id.NoDep);
        MildDep = (TextView)findViewById(com.example.android.depressiontest.R.id.MildDep);
        ModDep = (TextView)findViewById(com.example.android.depressiontest.R.id.ModDep);
        ModSevDep = (TextView)findViewById(com.example.android.depressiontest.R.id.ModSevDep);
        SevDep = (TextView)findViewById(com.example.android.depressiontest.R.id.SevDep);
        //MainMenu = findViewById(R.id.ButtonMenu);

        getName = getIntent().getStringExtra("NamaUser");
        nilaiInt = getIntent().getIntExtra("nilai",0);

        if (nilaiInt <= 4){
            TestResult.setText("Hi, " + getName + ", your PHQ-9 Score is " + nilaiInt +
                    ". Your total score indicates that you have No Depression. ");
        }
        else if (nilaiInt <= 9){
            TestResult.setText("Hi, " + getName + ", your PHQ-9 Score is " + nilaiInt +
                    ". This indicates that you may have Mild Depression. Please contact the hotline numbers if your symptoms worsen and affects your daily activities. ");
        }
        else if (nilaiInt <=14){
            TestResult.setText("Hi, " + getName + ", your PHQ-9 Score is " + nilaiInt +
                    ". This indicates that you may have Moderate Depression. We gladly suggest you to meet your doctor.");
        }
        else if (nilaiInt <=22){
            TestResult.setText("Hi, " + getName + ", your PHQ-9 Score is " + nilaiInt +
                    ". This indicates that you may have Moderate to Severe Depression. We gladly suggest you to meet your doctor.");
        }
        else if (nilaiInt > 22){
            TestResult.setText("Hi, " + getName + ", your PHQ-9 Score is " + nilaiInt +
                    ". This indicates that you have severe depression. Please meet your doctor to get necessary treatment. ");
        }


        ScoreRange.setText("Depression Score Range (PHQ-9):");

        NoDep.setText("0 to 4: No Depression or Just Sad");
        MildDep.setText("5 to 9: Mild Depression");
        ModDep.setText("10 to 14: Moderate Depression");
        ModSevDep.setText("15 to 19: Moderate to Severe Depression");
        SevDep.setText("more than 20: Severe Depression");

        Disclaimer.setText("PHQ-9, Patient Health Questionnaire 9:-" + " Developed by Drs Robert L Spitzer, Janet B.W. Williams, Kurt Kroenke and colleages, with an educational grant from Pfizer Inc."
                + " No permission required to reproduce, translate, display or contribute.");


        viewRec = (Button)findViewById(com.example.android.depressiontest.R.id.recList);
        viewRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r =new Intent(getApplicationContext(), ReccomendActivity.class);


                startActivity(r);
            }
        });

    }
}
