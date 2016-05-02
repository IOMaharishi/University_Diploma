package com.example.illia.BarManager.fragments.Order;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.BarManager.R;

/**
 * Created by wwwmu on 22.01.2016.
 */
public class FragmentPatternViewPager extends Fragment {

     private   RowEntity[] entities;



    public FragmentPatternViewPager(RowEntity[] entities){

        this.entities = entities;

    }


    @Override
    public void onDestroy() {
        clear();
        super.onDestroy();
    }

    public void clear(){
        for (int i=0; i<entities.length; i++){
            entities[i].setCount(0);
        }
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.order_list_activity, container, false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        MyAdapter adapter = new MyAdapter(entities);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

//        getActivity().getSupportFragmentManager().saveFragmentInstanceState(false);
        System.gc();

        return view;
    }



    public RowEntity[] getEntities(){
        return entities;
    }

}
