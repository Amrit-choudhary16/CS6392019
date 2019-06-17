package com.example.menuproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.menuproject.ui.mainactivity.MainActivityFragmentFragment;

public class main_activity_fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_fragment_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainActivityFragmentFragment.newInstance())
                    .commitNow();
        }
    }
}
