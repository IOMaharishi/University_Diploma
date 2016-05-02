package com.example.illia.BarManager.fragments.Menu.non_alcohol.list;

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
 * Created by wwwmu on 19.01.2016.
 */
public class TeeFragment extends Fragment {

    View view;


    static CoreMenuData itemsData[] = { new CoreMenuData("Самовар", R.drawable.help, "Some Price"),
            new CoreMenuData("Смесь травянная",R.drawable.content_discard,"Some price"),
            new CoreMenuData("Чай зеленый",R.drawable.content_discard,"Some price"),
            new CoreMenuData("Чай черный",R.drawable.content_discard,"Some price"),

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tee_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);




        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        CoreMenuAdapter mAdapter = new CoreMenuAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        System.gc();
        return view;
    }
}