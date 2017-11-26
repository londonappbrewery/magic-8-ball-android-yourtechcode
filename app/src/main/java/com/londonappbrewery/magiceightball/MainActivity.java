package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askBtn = (Button)findViewById(R.id.askBtn);
        final ImageView ballImage = (ImageView)findViewById(R.id.ballImage);

        final int[] ballArray = {R.drawable.ball1 , R.drawable.ball2 , R.drawable.ball3 , R.drawable.ball4 , R.drawable.ball5};

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AskBtn" , "Ask Button pressed");

                Random randomNUmber = new Random();

                int number = randomNUmber.nextInt(5);

                Log.d("TAG @" , "The number " + number);

                ballImage.setImageResource(ballArray[number]);
            }
        });
    }
}
