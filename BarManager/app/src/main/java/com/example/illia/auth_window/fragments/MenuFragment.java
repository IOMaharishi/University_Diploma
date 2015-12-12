package com.example.illia.auth_window.fragments;


import android.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.illia.auth_window.R;

/**
 * Created by Illia on 11/25/15.
 */
public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_activity, container, false);

        final FragmentManager fragmentManager = this.getActivity().getFragmentManager();


        Button button = (Button) view.findViewById(R.id.button);


        View.OnClickListener oclBtnOk = new View.OnClickListener() {

        Fragment fragment = new MenuFragment();
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction().replace(R.id.menu_container, new MenuFragment2()).commit();
            }
        };

        button.setOnClickListener(oclBtnOk);

        return view;
    }




}
