package com.apps.nishtha.allaboutigdtuw.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.nishtha.allaboutigdtuw.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SocietiesFragment extends Fragment {


    public SocietiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_societies, container, false);
    }

}
