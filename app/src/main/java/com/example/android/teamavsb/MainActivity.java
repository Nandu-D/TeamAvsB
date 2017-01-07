package com.example.android.teamavsb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void plus2A(View view){
        scoreA = scoreA + 2;
        displayScoreA(scoreA);
    }
    public void plus3A(View view){
        scoreA = scoreA + 3;
        displayScoreA(scoreA);
    }

    public void minus2A(View view){
        scoreA = scoreA - 2;
        displayScoreA(scoreA);
    }

    public void minus3A(View view){
        scoreA = scoreA - 3;
        displayScoreA(scoreA);
    }

    public void plus2B(View view){
        scoreB = scoreB + 2;
        displayScoreB(scoreB);
    }

    public void plus3B(View view){
        scoreB = scoreB + 3;
        displayScoreB(scoreB);
    }

    public void minus2B(View view){
        scoreB = scoreB - 2;
        displayScoreB(scoreB);
    }

    public void minus3B(View view){
        scoreB = scoreB - 3;
        displayScoreB(scoreB);
    }

    private void displayScoreA(int score){
        TextView  setScoreA = (TextView) findViewById(R.id.teamA_score);
        setScoreA.setText(String.valueOf(score));
    }

    private void displayScoreB(int score){
        TextView  setScoreB = (TextView) findViewById(R.id.teamB_score);
        setScoreB.setText(String.valueOf(score));
    }
}
