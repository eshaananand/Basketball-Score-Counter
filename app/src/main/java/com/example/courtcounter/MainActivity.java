package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(countA);
        displayForTeamB(countB);
    }
    int countA =0;
    int countB =0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void three_a_score(View View)
    {
        countA+=3;
        displayForTeamA(countA);
    }
    public void two_a_score(View View)
    {
        countA+=2;
        displayForTeamA(countA);
    }
    public void one_a_score(View View)
    {
        countA+=1;
        displayForTeamA(countA);;
    }
    public void reset(View View)
    {
        countA =0;
        displayForTeamA(countA);
        countB = 0;
        displayForTeamB(countB);
    }

    /**
     * Displays the given score for Team b.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void three_b_score(View View)
    {
        countB+=3;
        displayForTeamB(countB);
    }
    public void two_b_score(View View)
    {
        countB+=2;
        displayForTeamB(countB);
    }
    public void one_b_score(View View)
    {
        countB+=1;
        displayForTeamB(countB);;
    }

}