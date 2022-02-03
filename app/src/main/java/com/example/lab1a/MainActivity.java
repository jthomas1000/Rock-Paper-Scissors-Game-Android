package com.example.lab1cs408;

import static com.example.lab1cs408.Weapon.PAPER;
import static com.example.lab1cs408.Weapon.ROCK;
import static com.example.lab1cs408.Weapon.SCISSORS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.ObjectInput;
import java.text.BreakIterator;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private int playerCounter = 0;
    private int computerCounter = 0;
    Random random = new Random();



    private void selectWeapon(Weapon playerWeapon) {

        // insert code here
                switch (playerWeapon) {
                    case ROCK:
                        TextView r = findViewById(R.id.playersWeapon);
                        r.setText("Player's Weapon: Rock");
                        break;

                    case PAPER:
                        TextView p = findViewById(R.id.playersWeapon);
                        p.setText("Player's Weapon: Paper");
                        break;

                    case SCISSORS:
                        TextView s = findViewById(R.id.playersWeapon);
                        s.setText("Player's Weapon: Scissors");
                        break;

                    default:
                        TextView e = findViewById(R.id.playersWeapon);
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
                if ( random.nextInt(3) == 0 ){
                    TextView wp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    wp.setText("Player wins...Paper covers Rock!");
                    TextView r = findViewById(R.id.computers_weapon);
                    r.setText("Computer's Weapon: Rock");
                    playerCounter++;
                }
                else if ( random.nextInt(3) == 1){
                    TextView rs = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    rs.setText("It's a Tie!");
                    TextView p = findViewById(R.id.computers_weapon);
                    p.setText("Computer's Weapon: Paper");}

                else if (random.nextInt(3) == 2){
                    TextView pp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    pp.setText("Computer wins...Scissors cuts Paper!");
                    TextView s = findViewById(R.id.computers_weapon);
                    s.setText("Computer's Weapon: Scissors");
                    computerCounter++;
                }
                TextView counter = (TextView)view.getRootView().findViewById(R.id.winner_counter);
                counter.setText("Player Wins: " + playerCounter + " Computer Wins: " + computerCounter);
            }
        });

        findViewById(R.id.scissorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectWeapon(Weapon.SCISSORS);
                if (random.nextInt(3) == 0 ){
                    TextView ab = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    ab.setText("Computer wins...Rock smashes Scissors!");
                    TextView r = findViewById(R.id.computers_weapon);
                    r.setText("Computer's Weapon: Rock");
                    computerCounter++;
                }
                else if (random.nextInt(3) == 1 ){
                    TextView cp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    cp.setText("Player wins...Scissors cuts Paper!");
                    TextView p = findViewById(R.id.computers_weapon);
                    p.setText("Computer's Weapon: Paper");
                    playerCounter++;
                }
                else if (random.nextInt(3) == 2  ){
                    TextView hp = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    hp.setText("It's a Tie!");
                    TextView s = findViewById(R.id.computers_weapon);
                    s.setText("Computer's Weapon: Scissors");}

                TextView counter = (TextView)view.getRootView().findViewById(R.id.winner_counter);
                counter.setText("Player Wins: " + playerCounter + " Computer Wins: " + computerCounter);
            }
        });

        findViewById(R.id.rockButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectWeapon(Weapon.ROCK);

                if ( random.nextInt(3) == 0 ){
                    TextView wc = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    wc.setText("It's a Tie!");
                    TextView r = findViewById(R.id.computers_weapon);
                    r.setText("Computer's Weapon: Rock");
                }
                else if ( random.nextInt(3)  == 1 ){
                    TextView wr = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    wr.setText("Computer wins...Paper covers Rock!");
                    TextView p = findViewById(R.id.computers_weapon);
                    p.setText("Computer's Weapon: Paper");
                    computerCounter++;
                }
                else if ( random.nextInt(3) == 2){
                    TextView wb = (TextView)view.getRootView().findViewById(R.id.winner_condition);
                    wb.setText("Player wins...Rock smashes Scissors!");
                    TextView s = findViewById(R.id.computers_weapon);
                    s.setText("Computer's Weapon: Scissors");
                    playerCounter++;
                }
                TextView counter = (TextView)view.getRootView().findViewById(R.id.winner_counter);
                counter.setText("Player Wins: " + playerCounter + " Computer Wins: " + computerCounter);
            }
        });

    }
}
