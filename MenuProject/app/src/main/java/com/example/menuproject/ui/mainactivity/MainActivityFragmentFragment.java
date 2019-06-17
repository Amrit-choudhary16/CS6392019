package com.example.menuproject.ui.mainactivity;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.menuproject.R;

public class MainActivityFragmentFragment extends Fragment {

    private MainActivityViewModel mViewModel;

    public static MainActivityFragmentFragment newInstance() {
        return new MainActivityFragmentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_activity_fragment, container, false);
        // after you've done all your manipulation, return your layout to be shown
    }

    public static final String TAG = "MainActivity";

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        // TODO: Use the ViewModel
        Button mButton = (Button) getActivity().findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: done");
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("sms:" + Uri.encode("+1 551-399-7992")));
                intent.putExtra("sms_body", "AMRIT CHOUDHARY");
                startActivity(intent);
                // here you set what you want to do when user clicks your button,
            }
        });
        Button mButton1 = (Button) getActivity().findViewById(R.id.button2);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:5513997992"));
                startActivity(intent);
            }
        });

        Button mButton2 = (Button) getActivity().findViewById(R.id.button3);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com"));
                startActivity(websiteIntent);
            }
        });
        Button mButton3 = (Button) getActivity().findViewById(R.id.button4);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: MAP");
                String geoUri = String.format("geo:12.9716, 77.5946");
                Uri geo = Uri.parse(geoUri);
                Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
                startActivity(geoMap);
            }

        });
        Button mButton4 = (Button) getActivity().findViewById(R.id.button5);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "CS639");
                intent.putExtra(Intent.EXTRA_TEXT, "JOIN CS639");
                startActivity(Intent.createChooser(intent, "Share The Love"));
            }
        });
    }
}