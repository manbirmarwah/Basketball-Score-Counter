package com.example.android.basketballcountercolorful;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import com.example.android.basketballcountercolorful.R;

public class MainActivity extends AppCompatActivity {
    int ptsA=0;
    int ptsB=0;

    public void reset(View view) {
        ptsA = 0;
        ptsB = 0;
        displayForTeamA(ptsA);
        displayForTeamB(ptsB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }

    public void A3(View view) {
        ptsA = ptsA+3;
        displayForTeamA(ptsA);
    }

    public void A2(View view) {
        ptsA = ptsA+2;
        displayForTeamA(ptsA);
    }

    public void A1(View view) {
        ptsA = ptsA+1;
        displayForTeamA(ptsA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    public void B3(View view) {
        ptsB = ptsB+3;
        displayForTeamB(ptsB);
    }

    public void B2(View view) {
        ptsB = ptsB+2;
        displayForTeamB(ptsB);
    }

    public void B1(View view) {
        ptsB = ptsB+1;
        displayForTeamB(ptsB);
    }


}
