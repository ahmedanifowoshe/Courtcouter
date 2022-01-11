package com.example.courtcounter;

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
    int team_a_score = 0;
    int team_b_score = 0;


    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view){
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);

    }


    public void add_three(View view){
       team_a_score = team_a_score + 3;
       displayForTeamA(team_a_score);


    }

   public void add_two(View view){
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);

   }

   public void add_one(View view){
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
   }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addThree(View view){
        team_b_score = team_b_score + 3;
        displayForTeamB( team_b_score);
    }

    public void addTwo(View view){
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }

    public void addOne(View view){
        team_b_score = team_b_score + 1;
        displayForTeamB( team_b_score);
    }


}
