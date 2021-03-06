package com.example.menuproject.ui.newactivity;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.menuproject.NewActivity;
import com.example.menuproject.R;

public class NewActivityFragment extends Fragment {

    private NewActivityViewModel mViewModel;

    public static NewActivityFragment newInstance() {
        return new NewActivityFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.new_activity_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NewActivityViewModel.class);
        // TODO: Use the ViewModel
        Button mButton5=(Button) getActivity().findViewById(R.id.button6);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent=new Intent(getActivity(),NewActivity.class);
                startActivity(intent);



            }
        });
    }

}
