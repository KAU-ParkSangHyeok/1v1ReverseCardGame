package com.example.a1v1reversecardgame;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);



        View.OnClickListener CardClick = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(v == button1) {
                    if(button1.getCurrentTextColor() == Color.BLUE){
                        button1.setTextColor(Color.RED);
                        button1.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button2) {
                    if(button2.getCurrentTextColor() == Color.BLUE){
                        button2.setTextColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button3) {
                    if(button3.getCurrentTextColor() == Color.BLUE){
                        button3.setTextColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button4) {
                    if(button4.getCurrentTextColor() == Color.BLUE){
                        button4.setTextColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button5) {
                    if(button5.getCurrentTextColor() == Color.BLUE){
                        button5.setTextColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button6) {
                    if (button6.getCurrentTextColor() == Color.BLUE) {
                        button6.setTextColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button7) {
                    if(button7.getCurrentTextColor() == Color.BLUE){
                        button7.setTextColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button8) {
                    if(button8.getCurrentTextColor() == Color.BLUE){
                        button8.setTextColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button9) {
                    if(button9.getCurrentTextColor() == Color.BLUE){
                        button9.setTextColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button10) {
                    if(button10.getCurrentTextColor() == Color.BLUE){
                        button10.setTextColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button11) {
                    if(button11.getCurrentTextColor() == Color.BLUE){
                        button11.setTextColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                    }
                }
                else if(v == button12) {
                    if(button12.getCurrentTextColor() == Color.BLUE){
                        button12.setTextColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                    }
                }
            }
        };

        button1.setOnClickListener( CardClick );
        button2.setOnClickListener( CardClick );
        button3.setOnClickListener( CardClick );
        button4.setOnClickListener( CardClick );
        button5.setOnClickListener( CardClick );
        button6.setOnClickListener( CardClick );
        button7.setOnClickListener( CardClick );
        button8.setOnClickListener( CardClick );
        button9.setOnClickListener( CardClick );
        button10.setOnClickListener( CardClick );
        button11.setOnClickListener( CardClick );
        button12.setOnClickListener( CardClick );

    }


}

