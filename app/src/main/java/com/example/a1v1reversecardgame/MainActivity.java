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
import android.widget.ImageView;
import android.widget.TextView;

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
        Button endno = (Button) findViewById(R.id.EndNo);
        Button endyes = (Button) findViewById(R.id.EndYes);
        TextView endview = (TextView) findViewById(R.id.EndView);
        Button rule = (Button) findViewById(R.id.GameRule);
        ImageView gameruleimage = (ImageView) findViewById(R.id.GameRuleImage);
        Button ruleclose = (Button) findViewById(R.id.GameRuleClose);


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
        endno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startButton.setVisibility(View.VISIBLE);
                endno.setVisibility(View.INVISIBLE);
                endyes.setVisibility(View.INVISIBLE);
                endview.setVisibility(View.INVISIBLE);
                rule.setVisibility(View.VISIBLE);
            }
        });
        endyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mainbgm.stop();
                moveTaskToBack(true);						// 태스크를 백그라운드로 이동
                finishAndRemoveTask();						// 액티비티 종료 + 태스크 리스트에서 지우기
                android.os.Process.killProcess(android.os.Process.myPid());	// 앱 프로세스 종료
            }
        });
        rule.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startButton.setVisibility(View.INVISIBLE);
                easybutton.setVisibility(View.INVISIBLE);
                hardbutton.setVisibility(View.INVISIBLE);
                endno.setVisibility(View.INVISIBLE);
                endyes.setVisibility(View.INVISIBLE);
                endview.setVisibility(View.INVISIBLE);
                rule.setVisibility(View.INVISIBLE);
                gameruleimage.setVisibility(View.VISIBLE);
                ruleclose.setVisibility(View.VISIBLE);
            }
        });
        ruleclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                gameruleimage.setVisibility(View.INVISIBLE);
                ruleclose.setVisibility(View.INVISIBLE);
                startButton.setVisibility(View.VISIBLE);
                rule.setVisibility(View.VISIBLE);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Button startButton = (Button) findViewById(R.id.startButton);
        Button easybutton = (Button) findViewById(R.id.easybutton);
        Button hardbutton = (Button) findViewById(R.id.hardbutton);
        Button endno = (Button) findViewById(R.id.EndNo);
        Button endyes = (Button) findViewById(R.id.EndYes);
        TextView endview = (TextView) findViewById(R.id.EndView);
        Button rule = (Button) findViewById(R.id.GameRule);
        ImageView gameruleimage = (ImageView) findViewById(R.id.GameRuleImage);
        Button ruleclose = (Button) findViewById(R.id.GameRuleClose);

        startButton.setVisibility(View.INVISIBLE);
        easybutton.setVisibility(View.INVISIBLE);
        hardbutton.setVisibility(View.INVISIBLE);
        endno.setVisibility(View.VISIBLE);
        endyes.setVisibility(View.VISIBLE);
        endview.setVisibility(View.VISIBLE);
        gameruleimage.setVisibility(View.INVISIBLE);
        ruleclose.setVisibility(View.INVISIBLE);
        rule.setVisibility(View.INVISIBLE);
    }

}