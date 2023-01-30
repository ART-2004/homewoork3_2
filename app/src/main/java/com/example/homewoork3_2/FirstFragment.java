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

public class FirstFragment extends Fragment {

    private Button btnFirst;
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initclick();
        initView();
    }

    private void initclick() {
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFregment();
            }
        });
    }

    private void nextFregment() {
        Bundle bundle = new Bundle();
        bundle.putString("name", editText.getText().toString());
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,fragment).commit();
    }

    private void initView() {
        btnFirst = (Button) requireActivity().findViewById(R.id.btn_first);
        editText = requireActivity().findViewById(R.id.et_name);
    }
}