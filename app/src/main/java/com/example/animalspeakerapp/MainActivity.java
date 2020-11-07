package com.example.animalspeakerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton lion,bear,camel,cat,leopard,zebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lion = findViewById(R.id.lion);
        bear = findViewById(R.id.bear);
        camel = findViewById(R.id.camel);
        cat = findViewById(R.id.cat);
        leopard = findViewById(R.id.leopard);
        zebra = findViewById(R.id.zebra);

        lion.setOnClickListener(MainActivity.this);
        bear.setOnClickListener(MainActivity.this);
        camel.setOnClickListener(MainActivity.this);
        cat.setOnClickListener(MainActivity.this);
        leopard.setOnClickListener(MainActivity.this);
        zebra.setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.lion:
                animalName(lion.getTag().toString());
                break;

            case R.id.bear:
                animalName(bear.getTag().toString());
                break;

            case R.id.camel:
                animalName(camel.getTag().toString());
                break;

            case R.id.cat:
                animalName(cat.getTag().toString());
                break;

            case R.id.leopard:
                animalName(leopard.getTag().toString());
                break;

            case R.id.zebra:
                animalName(zebra.getTag().toString());
                break;


        }

    }

    private void animalName(String name)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(name,"raw",getPackageName()));

        mediaPlayer.start();
    }
}
