package com.example.homewoork3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourFragment extends Fragment {

    private TextView textView_name;
    private TextView textView_age;
    private TextView textView_gender;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String result_name = getArguments().getString("name_second");
        String result_age = getArguments().getString("age_first");
        String result_gender = getArguments().getString("gender");

        textView_name.setText(result_name);
        textView_age.setText(result_age);
        textView_gender.setText(result_gender);
        inetView();
    }

    private void inetView() {
        textView_name = requireActivity().findViewById(R.id.tv_name_four);
        textView_age = requireActivity().findViewById(R.id.tv_age_four);
        textView_gender = requireActivity().findViewById(R.id.tv_gender_four);
    }
}