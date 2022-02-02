package com.example.lab1a;

import static com.example.lab1a.Weapon.PAPER;
import static com.example.lab1a.Weapon.ROCK;
import static com.example.lab1a.Weapon.SCISSORS;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int playerCounter = 0;
    private int computerCounter = 0;
    int random = Random.nextInt(3);

    private void selectWeapon(Weapon playerWeapon) {

        // insert code here
        this.playerweapon = weapon;



            switch(weapon) {
                case ROCK :
                    TextView r = (TextView)view.getRootView().findViewById(R.id.playersWeapon);
                    r.setText("Player's Weapon: Rock");
                    break;

                case PAPER :
                    TextView p = (TextView)view.getRootView().findViewById(R.id.playersWeapon);
                    p.setText("Player's Weapon: Paper");
                    break;

                case SCISSORS :
                    TextView s = (TextView)view.getRootView().findViewById(R.id.playersWeapon);
                    s.setText("Player's Weapon: Scissors");
                    break;

                default:
                    TextView e = (TextView)view.getRootView().findViewById(R.id.playersWeapon);
                    e.setText("error");
                    break;
            }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.paperButton).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                selectWeapon(Weapon.PAPER);
            }
        }

        findViewById(R.id.scissorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectWeapon(Weapon.SCISSORS);
            }
        }
        findViewById(R.id.rockButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectWeapon(Weapon.ROCK);
            }
        }

        switch (random) {
            case 0:
                TextView r = (TextView)view.getRootView().findViewById(R.id.computers_weapon);
                r.setText("Computer's Weapon: Rock");
                break;

            case 1 :
                TextView p = (TextView)view.getRootView().findViewById(R.id.computers_weapon);
                p.setText("Computer's Weapon: Paper");
                break;

            case 2 :
                TextView s = (TextView)view.getRootView().findViewById(R.id.computers_weapon);
                s.setText("Computer's Weapon: Scissors");
                break;

            default:
                TextView e = (TextView)view.getRootView().findViewById(R.id.computers_weapon);
                e.setText("error");
                break;

    }
        if (weapon = ROCK && random = 0 ){
            TextView wc = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            wc.setText("It's a Tie!");
        }
        else if (weapon = ROCK && random = 1 ){
            TextView wr = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            wr.setText("Computer wins...Paper covers Rock!");
            computerCounter++;
        }
        else if (weapon = ROCK && random = 2){
                TextView wb = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                wb.setText("Player wins...Rock smashes Scissors!");
                playerCounter++;
        }
        else if (weapon = PAPER && random = 0 ){
                    TextView wp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    wp.setText("Player wins...Paper covers Rock!");
                    playerCounter++;
        }
        else if (weapon = PAPER && random = 1){
            TextView rs = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            rs.setText("It's a Tie!"); }
        else if (weapon = PAPER && random = 2 ){
            TextView pp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            pp.setText("Player wins...Scissors cuts Paper!");
            playerCounter++;
        }
        else if (weapon = SCISSORS && random = 0 ){
            TextView ab = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            ab.setText("Computer wins...Rock smashes Scissors!");
            computerCounter++;
        }
        else if (weapon = SCISSORS && random = 1 ){
            TextView cp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            cp.setText("Player wins...Scissors cuts Paper!");
            playerCounter++;
        }
        else if (weapon = SCISSORS && random = 2 ){
            TextView hp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
            hp.setText("It's a Tie!"); }

        TextView counter = (TextView)view.getRootView().findViewById(R.id.winner_counter);
        counter.setText("Player Wins: " + playerCounter + "Compter Wins: " + computerCounter);
}
}