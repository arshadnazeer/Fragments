package com.example.android.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    @Override
    public void respond(String data)

    {

        FragmentManager manager = getFragmentManager();
        MyFragment2 f2 = (MyFragment2)  manager.findFragmentById(R.id.fragment2);
        f2.changetext(data);





    }
}
