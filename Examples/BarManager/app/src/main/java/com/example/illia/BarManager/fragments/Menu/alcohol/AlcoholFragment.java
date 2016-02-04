package com.example.illia.BarManager.fragments.Menu.alcohol;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Menu.*;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.beer.BeerFragment;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.champagne.ChampagneFragment;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.vine.VineFragment;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.vodka.VodkaFragment;


/**
 * Created by Illia on 1/12/16.
 */
public class AlcoholFragment extends Fragment {

    View view;
    FragmentManager fragmentManager;

     CoreMenuData itemsData[] = { new CoreMenuData("Пиво",R.drawable.help, new BeerFragment()),
            new CoreMenuData("Водка",R.drawable.content_discard, new VodkaFragment()),
            new CoreMenuData("Вино",R.drawable.collections_cloud, new VineFragment()),
            new CoreMenuData("Шампанское",R.drawable.dessert2, new ChampagneFragment()),
      };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.alcohol_activity, container, false);
        fragmentManager = this.getActivity().getSupportFragmentManager();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);




        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        CoreMenuAdapter mAdapter = new CoreMenuAdapter(itemsData, fragmentManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        System.gc();
        return view;
    }
}
