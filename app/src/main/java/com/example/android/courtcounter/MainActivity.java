package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ascore = 0;
    int bscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    public void athree(View view){
        ascore = ascore + 3;
        displayForTeamA(ascore);

    }
    public void atwo(View view){
        ascore = ascore + 2;
        displayForTeamA(ascore);

    }
    public void afree(View view){
        ascore = ascore + 0;
        displayForTeamA(ascore);

    }


    public void bthree(View view){
        bscore = bscore + 3;
        displayForTeamB(bscore);

    }
    public void btwo(View view){
        bscore = bscore + 2;
        displayForTeamB(bscore);

    }
    public void bfree(View view){
        bscore = bscore + 0;
        displayForTeamB(bscore);

    }

    public void reset(View view){
        ascore = 0;
        bscore = 0;
        displayForTeamA(ascore);
        displayForTeamB(bscore);

    }

}


