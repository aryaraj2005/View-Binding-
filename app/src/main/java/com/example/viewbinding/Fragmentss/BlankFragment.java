package com.example.viewbinding.Fragmentss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.viewbinding.R;
import com.example.viewbinding.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    FragmentBlankBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater, container, false);
        binding.blnktxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Fragment Toast", Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}