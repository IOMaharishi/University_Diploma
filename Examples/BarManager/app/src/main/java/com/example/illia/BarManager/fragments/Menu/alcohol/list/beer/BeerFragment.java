package com.example.illia.BarManager.fragments.Menu.alcohol.list.beer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Menu.CoreMenuAdapter;
import com.example.illia.BarManager.fragments.Menu.CoreMenuData;
import com.example.illia.BarManager.fragments.Menu.alcohol.AlcoholFragment;

/**
 * Created by Illia on 1/16/16.
 */
public class BeerFragment extends Fragment {

    // Здесь должна высчитываться цена за единицу из файла меню
     CoreMenuData itemsData[] = {
            new CoreMenuData("Баклер",R.drawable.content_discard, "Some price"),
            new CoreMenuData("Бочкарев светлое",R.drawable.collections_cloud, "Some price"),
            new CoreMenuData("Невское",R.drawable.dessert2, "Some price"),
            new CoreMenuData("Хугарден",R.drawable.rating_good, "Some price"),
            };

View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.beer_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        CoreMenuAdapter adapter = new CoreMenuAdapter(itemsData);
        recyclerView.setAdapter(adapter);
        System.gc();
        return view;
    }
}
