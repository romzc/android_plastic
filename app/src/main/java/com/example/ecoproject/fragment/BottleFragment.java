package com.example.ecoproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ecoproject.R;

public class BottleFragment extends Fragment {

    public BottleFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BottleFragment newInstance(String param1, String param2) {
        BottleFragment fragment = new BottleFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottle, container, false);
    }
}