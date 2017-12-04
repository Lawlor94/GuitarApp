package com.example.lawlor.guitarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showSongList = (Button) findViewById(R.id.SongListBtn);
        final Button showChallengeActivity = (Button) findViewById(R.id.ChallengesBtn);

        showSongList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SongList.class);
                startActivity(intent);
            }
        });

        showChallengeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),ChallengeActivity.class);
                startActivity(intent);
            }
        });
    }
}
