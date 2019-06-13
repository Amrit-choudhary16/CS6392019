package com.example.imageviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.imageviewer.ui.bernesemountaindog.BerneseMountainDogFragment;

public class bernese_mountain_dog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bernese_mountain_dog_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, BerneseMountainDogFragment.newInstance())
                    .commitNow();
        }
    }
}
