package com.example.illia.auth_window.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.auth_window.R;

/**
 * Created by wwwmu on 01.12.2015.
 */
public class OrdersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
        return inflater.inflate(R.layout.order_activity, container, false);
    }

}
