package com.example.illia.BarManager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.BarManager.R;

/**
 * Created by wwwmu on 13.12.2015.
 */
public class TablesFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {











        view = inflater.inflate(R.layout.tables_activity, container, false);
        return view;
    }
}
