package com.example.imageviewer.ui.bernesemountaindog;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.imageviewer.R;

public class BerneseMountainDogFragment extends Fragment {

    private BerneseMountainDogViewModel mViewModel;

    public static BerneseMountainDogFragment newInstance() {
        return new BerneseMountainDogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bernese_mountain_dog_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BerneseMountainDogViewModel.class);
        // TODO: Use the ViewModel
    }

}
