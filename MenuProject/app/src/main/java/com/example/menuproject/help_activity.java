package com.example.menuproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.menuproject.ui.helpactivity.HelpActivityFragment;

public class help_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HelpActivityFragment.newInstance())
                    .commitNow();
        }
    }
}
