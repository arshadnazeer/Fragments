package com.example.android.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragment2 extends Fragment {



    String data;
    TextView textView;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_fragment2, container, false);

        if (savedInstanceState == null)
        {

        }
        else
        {
            data= savedInstanceState.getString("name");
            TextView txt = (TextView) view.findViewById(R.id.text1);
            txt.setText(data);

        }

        return  view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView) getActivity().findViewById(R.id.text1);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",data);
    }

    public void changetext (String name)
    {
        this.data = name;
        textView.setText(name);
    }
}
