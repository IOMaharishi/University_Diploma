package com.example.illia.BarManager.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.etsy.android.grid.StaggeredGridView;
import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Order.CreateOrderFragment;
import com.example.illia.BarManager.fragments.Order.order_list.OrderEntity;
import com.example.illia.BarManager.fragments.Order.order_list.OrderListAdapter;
import com.example.illia.BarManager.fragments.Order.order_list.OrderListSingelton;
import com.melnykov.fab.FloatingActionButton;

/**
 * Created by wwwmu on 01.12.2015.
 */
public class OrdersFragment extends Fragment {

    StaggeredGridView gridView;
    FloatingActionButton actionButton;
    OrderEntity orderEntity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.order_activity, container, false);

        final FragmentManager fragmentManager = this.getActivity().getSupportFragmentManager();
         actionButton = (FloatingActionButton) view.findViewById(R.id.fab);



        gridView = (StaggeredGridView) view.findViewById(R.id.grid_view);

                gridView.setAdapter(new OrderListAdapter(this.getActivity(), OrderListSingelton.getInstance().getOrder_list()));





        View.OnClickListener onClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction().replace(R.id.frame_container, new CreateOrderFragment()).commit();
                System.gc();

            }
        };

        actionButton.setOnClickListener(onClickListener);

        return view;
    }

}
