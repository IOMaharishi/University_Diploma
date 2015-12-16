package com.sample.drawer.fragments;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sample.drawer.MainActivity;
import com.sample.drawer.R;

/**
 * Created by wwwmu on 12.12.2015.
 */
public class Fragment4 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final FragmentManager fragmentManager = this.getActivity().getFragmentManager();


        View.OnClickListener listener  = new View.OnClickListener( ) {

            @Override
            public void onClick(View v) {



                this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Fragment4()).commit();

            }
        };


        return inflater.inflate(R.layout.fragment_4, container, false);
    }
}
