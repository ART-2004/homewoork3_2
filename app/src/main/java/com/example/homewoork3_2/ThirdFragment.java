package com.example.homewoork3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    private TextView textViewName;
    private TextView textViewAge;
    private Button button_third;
    private EditText editText_third;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String result_name = getArguments().getString("name_first");
        textViewName.setText(result_name);

        String result_age = getArguments().getString("age");
        textViewAge.setText(result_age);
        initView();
        initClick();
    }

    private void initClick() {
        button_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFragment();
            }
        });
    }

    private void nextFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("name_second", String.valueOf(textViewName));
        bundle.putString("age_first", String.valueOf(textViewAge));
        bundle.putString("gender", String.valueOf(editText_third));
        FourFragment fragment = new FourFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,fragment).commit();
    }

    private void initView() {
        textViewName = requireActivity().findViewById(R.id.tv_name_third);
        textViewAge = requireActivity().findViewById(R.id.tv_age_third);
        button_third = requireActivity().findViewById(R.id.btn_first);
        editText_third = requireActivity().findViewById(R.id.et_third);
    }
}