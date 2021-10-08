package com.example.myapplication_text1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Wechat3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Wechat3Fragment extends Fragment {

    public Wechat3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wechat3, container, false);
    }
}