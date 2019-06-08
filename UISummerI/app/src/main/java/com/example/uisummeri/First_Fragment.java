package com.example.uisummeri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.uisummeri.ui.first.FirstFragment;

public class First_Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first__activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FirstFragment.newInstance())
                    .commitNow();
        }
    }
}
