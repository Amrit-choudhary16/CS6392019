package com.example.midtermpracticalpart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.midtermpracticalpart.ui.fragment1.Fragment1Fragment;

public class fragment1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment1Fragment.newInstance())
                    .commitNow();
        }
    }
}
