package com.example.midtermpracticalpart.ui.fragment1;

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
import android.widget.EditText;
import android.widget.TextView;

import com.example.midtermpracticalpart.Display;
import com.example.midtermpracticalpart.R;

public class Fragment1Fragment extends Fragment {

    private Fragment1ViewModel mViewModel;

    public static Fragment1Fragment newInstance() {
        return new Fragment1Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1_fragment, container, false);
    }
    public static final String EXTRA_MESSAGE ="com.example.MidtermPracticalPart.MESSAGE";
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Fragment1ViewModel.class);
        // TODO: Use the ViewModel
        Button button;
        button =(Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), Display.class);
                EditText editText;
                editText =(EditText) getActivity().findViewById(R.id.edittext);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

    }

}
