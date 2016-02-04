package com.example.illia.BarManager.fragments.Menu.alcohol.list.vine;

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
public class VineFragment extends Fragment {
    // Здесь должна высчитываться цена за единицу из файла меню
    CoreMenuData itemsData[] = {
            new CoreMenuData("Каберне Совиньон", R.drawable.content_discard, "Some price"),
            new CoreMenuData("Рислинг Келлерберг", R.drawable.collections_cloud, "Some price"),
            new CoreMenuData("Маркез де Рискаль белое", R.drawable.dessert2, "Some price"),
            new CoreMenuData("Кристал", R.drawable.dessert2, "Some price")
    };

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.vine_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        CoreMenuAdapter adapter = new CoreMenuAdapter(itemsData);
        recyclerView.setAdapter(adapter);
        System.gc();
        return view;
    }
}
