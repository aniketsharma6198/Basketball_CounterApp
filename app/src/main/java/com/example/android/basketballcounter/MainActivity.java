package com.example.android.basketballcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 3 to the Team A Score.
     */
    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 2 to the Team A Score.
     */
    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 1 to the Team A Score.
     */
    public void addOneForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Add 3 to the Team B Score.
     */
    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 2 to the Team B Score.
     */
    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 1 to the Team B Score.
     */
    public void addOneForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset both teams score.
     */
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}