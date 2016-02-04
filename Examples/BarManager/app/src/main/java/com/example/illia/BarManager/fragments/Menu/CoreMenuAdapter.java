package com.example.illia.BarManager.fragments.Menu;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.illia.BarManager.R;

public class CoreMenuAdapter extends RecyclerView.Adapter<CoreMenuHolder> {

    private CoreMenuData[] itemsData;
    private FragmentManager fragmentManager;

    public CoreMenuAdapter(CoreMenuData[] itemsData, FragmentManager fragmentManager) {
        this.itemsData = itemsData;
        this.fragmentManager = fragmentManager;
    }

    public CoreMenuAdapter(CoreMenuData[] itemsData){
        this.itemsData = itemsData;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public CoreMenuHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_core_menu_layout, null);

        // create ViewHolder

        CoreMenuHolder viewHolder = new CoreMenuHolder(itemView,itemsData,fragmentManager);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CoreMenuHolder viewHolder, int position) {

        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());


    }




    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }
}