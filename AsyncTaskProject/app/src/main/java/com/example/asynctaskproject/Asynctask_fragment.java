package com.example.asynctaskproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asynctaskproject.ui.asynctask.AsynctaskFragmentFragment;

public class Asynctask_fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asynctask_fragment_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AsynctaskFragmentFragment.newInstance())
                    .commitNow();
        }
    }
}
