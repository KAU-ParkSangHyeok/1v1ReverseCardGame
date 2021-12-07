package com.example.a1v1reversecardgame;

import static android.view.View.INVISIBLE;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SubActivity extends AppCompatActivity {
    Handler handler = null;
    int i = 0;
    CountDownTimer opponent1;
    CountDownTimer opponent2;

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

        TextView LastTime = findViewById(R.id.LastTime);
        Button againbutton = (Button) findViewById(R.id.tryagain);
        Button mainbutton = (Button) findViewById(R.id.mainscreen);
        ImageView again = findViewById(R.id.Again);


        CountDownTimer timer;
        CountDownTimer startimer;




        timer = new CountDownTimer(61000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (millisUntilFinished / 1000 < 10) {
                    LastTime.setText("" + millisUntilFinished / 1000);
                } else {
                    LastTime.setText("00:" + millisUntilFinished / 1000);
                }

            }

            @Override
            public void onFinish() { // value는 1이됨.
                cardhide();
                againbutton.setVisibility(View.VISIBLE);
                mainbutton.setVisibility(View.VISIBLE);
                again.setVisibility(View.VISIBLE);
                finisher();
            }
        };
        startimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                LastTime.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                LastTime.setText("시작!!");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button1.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        button4.setVisibility(View.VISIBLE);
                        button5.setVisibility(View.VISIBLE);
                        button6.setVisibility(View.VISIBLE);
                        button7.setVisibility(View.VISIBLE);
                        button8.setVisibility(View.VISIBLE);
                        button9.setVisibility(View.VISIBLE);
                        button10.setVisibility(View.VISIBLE);
                        button11.setVisibility(View.VISIBLE);
                        button12.setVisibility(View.VISIBLE);

                        timer.start();
                        opponent1.start();
                    }
                }, 800);
            }
        };


        opponent1 = new CountDownTimer(50, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() { // value는 1이됨.
                int interval = new Random().nextInt(4)+3;
                interval*=100;

                opponent2 = new CountDownTimer(1000, interval) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        opponent();
                    }
                    @Override
                    public void onFinish() {
                        opponent1.start();
                    }
                };
                opponent2.start();
            }
        };

        startimer.start();



        View.OnClickListener CardClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == button1) {
                    if (button1.getCurrentTextColor() == Color.BLUE) {
                        button1.setTextColor(Color.RED);
                        button1.setBackgroundColor(Color.RED);
                    }
                } else if (v == button2) {
                    if (button2.getCurrentTextColor() == Color.BLUE) {
                        button2.setTextColor(Color.RED);
                        button2.setBackgroundColor(Color.RED);
                    }
                } else if (v == button3) {
                    if (button3.getCurrentTextColor() == Color.BLUE) {
                        button3.setTextColor(Color.RED);
                        button3.setBackgroundColor(Color.RED);
                    }
                } else if (v == button4) {
                    if (button4.getCurrentTextColor() == Color.BLUE) {
                        button4.setTextColor(Color.RED);
                        button4.setBackgroundColor(Color.RED);
                    }
                } else if (v == button5) {
                    if (button5.getCurrentTextColor() == Color.BLUE) {
                        button5.setTextColor(Color.RED);
                        button5.setBackgroundColor(Color.RED);
                    }
                } else if (v == button6) {
                    if (button6.getCurrentTextColor() == Color.BLUE) {
                        button6.setTextColor(Color.RED);
                        button6.setBackgroundColor(Color.RED);
                    }
                } else if (v == button7) {
                    if (button7.getCurrentTextColor() == Color.BLUE) {
                        button7.setTextColor(Color.RED);
                        button7.setBackgroundColor(Color.RED);
                    }
                } else if (v == button8) {
                    if (button8.getCurrentTextColor() == Color.BLUE) {
                        button8.setTextColor(Color.RED);
                        button8.setBackgroundColor(Color.RED);
                    }
                } else if (v == button9) {
                    if (button9.getCurrentTextColor() == Color.BLUE) {
                        button9.setTextColor(Color.RED);
                        button9.setBackgroundColor(Color.RED);
                    }
                } else if (v == button10) {
                    if (button10.getCurrentTextColor() == Color.BLUE) {
                        button10.setTextColor(Color.RED);
                        button10.setBackgroundColor(Color.RED);
                    }
                } else if (v == button11) {
                    if (button11.getCurrentTextColor() == Color.BLUE) {
                        button11.setTextColor(Color.RED);
                        button11.setBackgroundColor(Color.RED);
                    }
                } else if (v == button12) {
                    if (button12.getCurrentTextColor() == Color.BLUE) {
                        button12.setTextColor(Color.RED);
                        button12.setBackgroundColor(Color.RED);
                    }
                }
            }
        };

        button1.setOnClickListener(CardClick);
        button2.setOnClickListener(CardClick);
        button3.setOnClickListener(CardClick);
        button4.setOnClickListener(CardClick);
        button5.setOnClickListener(CardClick);
        button6.setOnClickListener(CardClick);
        button7.setOnClickListener(CardClick);
        button8.setOnClickListener(CardClick);
        button9.setOnClickListener(CardClick);
        button10.setOnClickListener(CardClick);
        button11.setOnClickListener(CardClick);
        button12.setOnClickListener(CardClick);


        againbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });
        mainbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    void cardhide() {
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

        button1.setVisibility(INVISIBLE);
        button2.setVisibility(INVISIBLE);
        button3.setVisibility(INVISIBLE);
        button4.setVisibility(INVISIBLE);
        button5.setVisibility(INVISIBLE);
        button6.setVisibility(INVISIBLE);
        button7.setVisibility(INVISIBLE);
        button8.setVisibility(INVISIBLE);
        button9.setVisibility(INVISIBLE);
        button10.setVisibility(INVISIBLE);
        button11.setVisibility(INVISIBLE);
        button12.setVisibility(INVISIBLE);
    }

    void finisher() {
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

        TextView LastTime = findViewById(R.id.LastTime);
        int red = 0;
        int blue = 0;

        if (button1.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button2.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button3.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button4.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button5.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button6.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button7.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button8.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button9.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button10.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button11.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;
        if (button12.getCurrentTextColor() == Color.RED)
            red++;
        else
            blue++;

        if (red > blue)
            LastTime.setText("승리!!  " + red + " : " + blue);
        else if (red < blue)
            LastTime.setText("패배..  " + red + " : " + blue);
        else
            LastTime.setText("무승부!  " + red + " : " + blue);

    }

    void opponent(){ // 문제 : 현재 문제는 깜빡이는것도 안될정도로 딜레이를 주고 반복하는 것이 안된다는 것임. 이거만 해결하면 됨.
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
        Random rand = new Random();

        int RandomChoice = rand.nextInt(12)+1;

        switch(RandomChoice){
            case 1:
                if(button1.getCurrentTextColor() == Color.RED){
                    button1.setTextColor(Color.BLUE);
                    button1.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 2:
                if(button2.getCurrentTextColor() == Color.RED){
                    button2.setTextColor(Color.BLUE);
                    button2.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 3:
                if(button3.getCurrentTextColor() == Color.RED){
                    button3.setTextColor(Color.BLUE);
                    button3.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 4:
                if(button4.getCurrentTextColor() == Color.RED){
                    button4.setTextColor(Color.BLUE);
                    button4.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 5:
                if(button5.getCurrentTextColor() == Color.RED){
                    button5.setTextColor(Color.BLUE);
                    button5.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 6:
                if(button6.getCurrentTextColor() == Color.RED){
                    button6.setTextColor(Color.BLUE);
                    button6.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 7:
                if(button7.getCurrentTextColor() == Color.RED){
                    button7.setTextColor(Color.BLUE);
                    button7.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 8:
                if(button8.getCurrentTextColor() == Color.RED){
                    button8.setTextColor(Color.BLUE);
                    button8.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 9:
                if(button9.getCurrentTextColor() == Color.RED){
                    button9.setTextColor(Color.BLUE);
                    button9.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 10:
                if(button10.getCurrentTextColor() == Color.RED){
                    button10.setTextColor(Color.BLUE);
                    button10.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 11:
                if(button11.getCurrentTextColor() == Color.RED){
                    button11.setTextColor(Color.BLUE);
                    button11.setBackgroundColor(Color.BLUE);
                    break;
                }
            case 12:
                if(button12.getCurrentTextColor() == Color.RED){
                    button12.setTextColor(Color.BLUE);
                    button12.setBackgroundColor(Color.BLUE);
                    break;
                }
        }
    }
}

