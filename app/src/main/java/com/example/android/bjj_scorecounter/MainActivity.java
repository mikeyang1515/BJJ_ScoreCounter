package com.example.android.bjj_scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.bjj_scorecounter.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }
    /**
     * Method when -1 Penalty button is clicked for Player 1
     */
    public void penaltyForPlayer1(View view) {
        scorePlayer1 = scorePlayer1 - 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Method when +2 Takedown/Sweep button is clicked for Player 1
     */
    public void twoPointsForPlayer1(View view) {
        scorePlayer1 = scorePlayer1 + 2;
        displayForPlayer1(scorePlayer1);
    }
    /**
     * Method when +3 Guard Pass button is clicked for Player 1
     */
    public void threePointsForPlayer1(View view) {
        scorePlayer1 = scorePlayer1 + 3;
        displayForPlayer1(scorePlayer1);
    }
    /**
     * Method when +4 Mount/Back button is clicked for Player 1
     */
    public void fourPointsForPlayer1(View view) {
        scorePlayer1 = scorePlayer1 + 4;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Method when -1 Penalty button is clicked for Player 2
     */
    public void penaltyForPlayer2(View view) {
        scorePlayer2 = scorePlayer2 - 1;
        displayForPlayer2(scorePlayer2);
    }
    /**
     * Method when +2 Takedown/Sweep button is clicked for Player 2
     */
    public void twoPointsForPlayer2(View view) {
        scorePlayer2 = scorePlayer2 + 2;
        displayForPlayer2(scorePlayer2);
    }
    /**
     * Method when +3 Guard Pass button is clicked for Player 2
     */
    public void threePointsForPlayer2(View view) {
        scorePlayer2 = scorePlayer2 + 3;
        displayForPlayer2(scorePlayer2);
    }
    /**
     * Method when +4 Mount/Back button is clicked for Player 2
     */
    public void fourPointsForPlayer2(View view) {
        scorePlayer2 = scorePlayer2 + 4;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Method when reset button is clicked
     */
    public void reset(View view) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }

}
