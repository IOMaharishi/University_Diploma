package com.example.illia.BarManager.fragments.Menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Menu.alcohol.AlcoholFragment;
import com.example.illia.BarManager.fragments.Menu.dessert.DessertFragment;
import com.example.illia.BarManager.fragments.Menu.main_food.Main_FoodFragment;
import com.example.illia.BarManager.fragments.Menu.non_alcohol.Non_AlcoholFragment;
import com.example.illia.BarManager.fragments.Menu.salat.SalatFragment;
import com.example.illia.BarManager.fragments.Menu.soups.SoupFragment;
import com.example.illia.BarManager.fragments.MenuFragment2;

/**
 * Created by Illia on 11/25/15.
 */
public class MenuFragment extends Fragment {


    FragmentManager fragmentManager;
    private Button button;

    private  View view ;
    private  MenuFragment2 menuFragment2 = new MenuFragment2();

     CoreMenuData itemsData[] = { new CoreMenuData("Основные блюда",R.drawable.help, new Main_FoodFragment()),
            new CoreMenuData("Салаты",R.drawable.content_discard, new SalatFragment()),
            new CoreMenuData("Супы",R.drawable.collections_cloud, new SoupFragment()),
            new CoreMenuData("Десерты",R.drawable.dessert2, new DessertFragment()),
            new CoreMenuData("Алкогольные напитки",R.drawable.rating_good, new AlcoholFragment()),
            new CoreMenuData("Безалкольные напитки",R.drawable.non_alcohol, new Non_AlcoholFragment())};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.menu_activity, container, false);
        fragmentManager = this.getActivity().getSupportFragmentManager();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);




        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        CoreMenuAdapter mAdapter = new CoreMenuAdapter(itemsData, fragmentManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        System.gc();
        return view;
    }

/*        view = inflater.inflate(R.layout.menu_activity, container, false);

        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(oclBtnOk);



        return view;
    }





    View.OnClickListener oclBtnOk = new View.OnClickListener() {


        @Override
        public void onClick(View v) {

            fragmentManager.beginTransaction().replace(R.id.frame_container, new MenuFragment2()).commit();
        }
    };


*/


}
