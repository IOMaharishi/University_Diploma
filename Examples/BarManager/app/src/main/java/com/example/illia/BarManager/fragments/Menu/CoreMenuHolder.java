package com.example.illia.BarManager.fragments.Menu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.illia.BarManager.R;

/**
 * Created by illia on 08.01.16.
 */
public class CoreMenuHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    FragmentManager fragmentManager;
    Fragment secondfragment;
    CoreMenuData[] itemsData;

    public TextView txtViewTitle;
    public ImageView imgViewIcon;

    public CoreMenuHolder(View itemView, CoreMenuData[] itemsData, FragmentManager fragmentManager) {
        super(itemView);
        itemView.setOnClickListener(this);

        this.itemsData = itemsData;
        this.fragmentManager = fragmentManager;

        txtViewTitle = (TextView) itemView.findViewById(R.id.item_title);
        imgViewIcon = (ImageView) itemView.findViewById(R.id.item_icon);








    }



    @Override
    public void onClick(View v) {

        secondfragment = itemsData[getAdapterPosition()].getFragment();

        if(secondfragment != null && fragmentManager != null){
            
            fragmentManager.beginTransaction().replace(R.id.frame_container, secondfragment).commit();
            System.gc();}
        else{
            System.gc();
        }
//            Toast.makeText(v.getContext(),  "You got a call from "+itemsData[getAdapterPosition()].getTitle() , Toast.LENGTH_LONG).show();



    }
}
