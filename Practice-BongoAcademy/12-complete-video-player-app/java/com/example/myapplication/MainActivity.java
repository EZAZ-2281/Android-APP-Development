package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout laySong1, laySong2, laySong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        laySong1 = findViewById(R.id.laySong1);
        laySong2 = findViewById(R.id.laySong2);
        laySong3 = findViewById(R.id.laySong3);

        laySong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video_player.video_url = "https://www.youtube.com/embed/BYFl_DD8I6g";
                Intent myIntent = new Intent(MainActivity.this, video_player.class);
                startActivity(myIntent);
            }
        });
        laySong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video_player.video_url = "https://www.youtube.com/embed/BYFl_DD8I6g";
                Intent myIntent = new Intent(MainActivity.this, video_player.class);
                startActivity(myIntent);
            }
        });
        laySong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video_player.video_url = "https://www.youtube.com/embed/BYFl_DD8I6g";
                Intent myIntent = new Intent(MainActivity.this, video_player.class);
                startActivity(myIntent);
            }
        });
    }
}