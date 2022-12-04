package com.example.meineapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.os.Bundle;
import android.view.View;

public class LadeSchirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lade_bildschrim);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                |   View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |   View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |   View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


    }
}