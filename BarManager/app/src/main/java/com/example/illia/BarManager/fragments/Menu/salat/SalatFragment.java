package com.example.illia.BarManager.fragments.Menu.salat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Menu.CoreMenuAdapter;
import com.example.illia.BarManager.fragments.Menu.CoreMenuData;

/**
 * Created by Illia on 1/15/16.
 */
public class SalatFragment extends Fragment {

    View view;


    static CoreMenuData itemsData[] = { new CoreMenuData("Винегрет",R.drawable.help, "Some Price"),
            new CoreMenuData("Оливье",R.drawable.content_discard,"Some price"),
            new CoreMenuData("Салат из Судака",R.drawable.content_discard,"Some price"),
            new CoreMenuData("Селедь под шубой",R.drawable.content_discard,"Some price"),

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.salat_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);




        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        CoreMenuAdapter mAdapter = new CoreMenuAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        System.gc();
        return view;
    }
}
