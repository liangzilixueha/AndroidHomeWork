package com.hahaha.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class Work524Fragment extends Fragment {
    private ConstraintLayout bg;
    private int color;

    //初始化
    public Work524Fragment() {
        color = Color.BLUE;
    }

    public Work524Fragment(int color) {
        this.color = color;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work524, container, false);
        bg = (ConstraintLayout) view.findViewById(R.id.bg);
        bg.setBackgroundColor(color);
        return view;
    }
}
