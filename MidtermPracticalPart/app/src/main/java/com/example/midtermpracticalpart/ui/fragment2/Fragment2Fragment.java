package com.example.midtermpracticalpart.ui.fragment2;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.midtermpracticalpart.R;
import com.example.midtermpracticalpart.ui.fragment1.Fragment1Fragment;

public class Fragment2Fragment extends Fragment {

    private Fragment2ViewModel mViewModel;

    public static Fragment2Fragment newInstance() {
        return new Fragment2Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Fragment2ViewModel.class);
        // TODO: Use the ViewModel

        Intent intent = getActivity().getIntent();
        String message = intent.getStringExtra(Fragment1Fragment.EXTRA_MESSAGE);
        double x= 1.609;
        String str3=message;
        double var3=Double.valueOf(str3);
        double result = x * var3;
        String finalresult=String.valueOf(result);
        TextView textView = getActivity().findViewById(R.id.textView3);
        textView.setText(finalresult);
    }
    }


