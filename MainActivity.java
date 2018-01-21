package com.example.android.pingpong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;
    String winA = "Player A wins !!!";
    String winB = "Player B wins !!!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ScoreA(View view) {
        if (scorePlayerA != 11 && scorePlayerB != 11) {
            scorePlayerA = scorePlayerA + 1;
            displayForPlayerA(scorePlayerA);
            if (scorePlayerA == 11) {
                displayWinA(winA);
            }
        }
    }

    public void FaulA(View view) {
        if (scorePlayerA != 11 && scorePlayerB != 11) {
            scorePlayerB = scorePlayerB + 1;
            displayForPlayerB(scorePlayerB);
            if (scorePlayerB == 11) {
                displayWinB(winB);
            }
        }
    }


    public void ScoreB(View view) {
        if (scorePlayerA != 11 && scorePlayerB != 11) {
            scorePlayerB = scorePlayerB + 1;
            displayForPlayerB(scorePlayerB);
            if (scorePlayerB == 11) {
                displayWinB(winB);
            }
        }
    }

    public void FaulB(View view) {
        if (scorePlayerA != 11 && scorePlayerB != 11) {
            scorePlayerA = scorePlayerA + 1;
            displayForPlayerA(scorePlayerA);
            if (scorePlayerA == 11) {
                displayWinA(winA);
            }
        }
    }


    public void displayWinA(String winA) {
        TextView scoreView = (TextView) findViewById(R.id.win);
        scoreView.setText(String.valueOf(winA));
    }

    public void displayWinB(String winB) {
        TextView scoreView = (TextView) findViewById(R.id.win);
        scoreView.setText(String.valueOf(winB));
    }

    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        displayWinA("");
        displayWinB("");
    }
}
