package com.example.menuproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.menuproject.ui.newactivity.NewActivityFragment;

public class new_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NewActivityFragment.newInstance())
                    .commitNow();
        }
    }
}
