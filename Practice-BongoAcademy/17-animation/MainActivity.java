package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView pen;
    Button button;
    Animation japan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pen = findViewById(R.id.pen);
        button = findViewById(R.id.button);
        japan = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pen.startAnimation(japan);
            }
        });
    }
}