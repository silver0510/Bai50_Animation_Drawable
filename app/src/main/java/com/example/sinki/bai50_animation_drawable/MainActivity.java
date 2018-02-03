package com.example.sinki.bai50_animation_drawable;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.sinki.bai50_animation_drawable.R.id.imgMinion;

public class MainActivity extends AppCompatActivity {
    Button btnStart,btnStop;
    ImageView imageHieuUng;

    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.start();

            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.stop();
            }
        });
    }

    private void addControls() {
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        imageHieuUng = (ImageView) findViewById(R.id.imgMinion);

        imageHieuUng.setBackgroundResource(R.drawable.hieuung);
        animationDrawable = (AnimationDrawable) imageHieuUng.getBackground();

    }
}
