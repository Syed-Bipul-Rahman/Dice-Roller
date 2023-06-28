package com.roomdb.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //global variables declaration
    ImageView imageView;
    Button roll;
    TextView score;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables initiallizations

        imageView = findViewById(R.id.imageView);
        roll = findViewById(R.id.button);
        score = findViewById(R.id.textView2);


        //setting action to work this dice roller
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random = new Random().nextInt(6) + 1;
                if (random == 1) {
                    imageView.setImageResource(R.drawable.dice_one);
                    score.setText("Your score is: "+random);
                } else if (random == 2) {
                    imageView.setImageResource(R.drawable.dice_two);
                    score.setText("Your score is: "+random);
                } else if (random == 3) {
                    imageView.setImageResource(R.drawable.dice_three);
                    score.setText("Your score is: "+random);
                } else if (random == 4) {
                    imageView.setImageResource(R.drawable.dice_four);
                    score.setText("Your score is: "+random);
                } else if (random == 5) {
                    imageView.setImageResource(R.drawable.dice_five);
                    score.setText("Your score is: "+random);
                } else if (random == 6) {
                    imageView.setImageResource(R.drawable.dice_six);
                    score.setText("Your score is: "+random);
                } else {
                    imageView.setImageResource(R.drawable.dice_cover);
                }
            }
        });


    }
}