package com.example.a1v1reversecardgame;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mainbgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mainbgm = MediaPlayer.create(this, R.raw.mainbgm);
        mainbgm.setLooping(true);
        mainbgm.start();

        Button startButton = (Button) findViewById(R.id.startButton);
        Button easybutton = (Button) findViewById(R.id.easybutton);
        Button hardbutton = (Button) findViewById(R.id.hardbutton);

        startButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startButton.setVisibility(View.INVISIBLE);
                easybutton.setVisibility(View.VISIBLE);
                hardbutton.setVisibility(View.VISIBLE);
            }
        });
        easybutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mainbgm.stop();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });
        hardbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mainbgm.stop();
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        System.exit(0);
        super.onBackPressed();
    }
}