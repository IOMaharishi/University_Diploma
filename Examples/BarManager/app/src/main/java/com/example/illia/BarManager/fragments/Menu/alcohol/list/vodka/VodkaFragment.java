package com.example.illia.BarManager.fragments.Menu.alcohol.list.vodka;

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

/**
 * Created by Illia on 1/16/16.
 */
public class VodkaFragment extends Fragment {

    // Здесь должна высчитываться цена за единицу из файла меню
    CoreMenuData itemsData[] = {
            new CoreMenuData("Горилка", R.drawable.content_discard, "Some price"),
            new CoreMenuData("Русский стандарт Голд",R.drawable.collections_cloud, "Some price"),
            new CoreMenuData("Русский стандарт Премиум",R.drawable.dessert2, "Some price"),
            new CoreMenuData("Флагман",R.drawable.rating_good, "Some price"),
    };

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.vodka_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        CoreMenuAdapter adapter = new CoreMenuAdapter(itemsData);
        recyclerView.setAdapter(adapter);
        System.gc();
        return view;
    }
}
