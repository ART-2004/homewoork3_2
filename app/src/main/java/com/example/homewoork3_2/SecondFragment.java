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

import com.google.android.material.bottomappbar.BottomAppBar;


public class SecondFragment extends Fragment {

    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String result = getArguments().getString("name");
        textView.setText(result.toString());
        initView();
        initClick();
    }

    private void initClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextFregment();
            }
        });
    }

    private void nextFregment() {
        Bundle bundle = new Bundle();
        bundle.putString("name_first", String.valueOf(textView));
        bundle.putString("age", String.valueOf(editText));
        ThirdFragment fragment = new ThirdFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.conteiner,fragment).commit();
    }

    private void initView() {
        textView = requireActivity().findViewById(R.id.tv_name_second);
        editText = requireActivity().findViewById(R.id.et_second);
        button = requireActivity().findViewById(R.id.btn_second);

    }
}