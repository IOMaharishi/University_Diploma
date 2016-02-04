package com.example.illia.BarManager.fragments.Menu.dessert;

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
import com.example.illia.BarManager.fragments.Menu.CoreMenuAdapter;
import com.example.illia.BarManager.fragments.Menu.CoreMenuData;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.beer.BeerFragment;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.champagne.ChampagneFragment;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.vine.VineFragment;
import com.example.illia.BarManager.fragments.Menu.alcohol.list.vodka.VodkaFragment;

/**
 * Created by Illia on 1/14/16.
 */
public class DessertFragment extends Fragment {

    View view;


    static CoreMenuData itemsData[] = { new CoreMenuData("Мороженое ванильное",R.drawable.help, "Some Price"),
            new CoreMenuData("Мороженое сливочное",R.drawable.content_discard,"Some price"),
            new CoreMenuData("Мороженое шоколадное",R.drawable.content_discard,"Some price"),
            new CoreMenuData("Мороженое крем-брюле",R.drawable.content_discard,"Some price"),

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.dessert_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);




        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        CoreMenuAdapter mAdapter = new CoreMenuAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        System.gc();
        return view;
    }
}
