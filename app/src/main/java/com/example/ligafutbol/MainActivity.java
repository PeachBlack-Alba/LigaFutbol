package com.example.ligafutbol;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double player1_score = 0;
    double player2_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addVictoryForPlayer1(View v) {
        ++player1_score;
        displayForPlayer1(player1_score);
    }


    public void addDrawForPlayer1(View v) {
        player1_score = player1_score - 1;
        displayForPlayer1(player1_score);
    }


    public void addVictoryForPlayer2(View v) {
        ++player2_score;
        displayForPlayer2(player2_score);
    }


    public void addDrawForPlayer2(View v) {
        player2_score = player2_score - 1;
        displayForPlayer2(player2_score);
    }


    public void displayForPlayer1(double score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForPlayer2(double score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }


    public void ResetScore(View v) {
        player1_score = 0;
        player2_score = 0;
        displayForPlayer1(player1_score);
        displayForPlayer2(player2_score);
    }
}