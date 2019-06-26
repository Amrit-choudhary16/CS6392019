package com.example.midtermpracticalpart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.midtermpracticalpart.ui.fragment2.Fragment2Fragment;

public class fragment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment2Fragment.newInstance())
                    .commitNow();
        }
    }
}