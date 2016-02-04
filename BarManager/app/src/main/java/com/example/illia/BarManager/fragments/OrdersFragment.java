package com.example.illia.BarManager.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Order.CreateOrderFragment;
import com.example.illia.BarManager.fragments.Order.order_list.Product;
import com.example.illia.BarManager.fragments.Order.order_list.ProductAdapter;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwwmu on 01.12.2015.
 */
public class OrdersFragment extends Fragment {

    GridView gridView;
    FloatingActionButton actionButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.order_activity, container, false);

        final FragmentManager fragmentManager = this.getActivity().getSupportFragmentManager();
         actionButton = (FloatingActionButton) view.findViewById(R.id.fab);

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Product #1", 22));
        products.add(new Product("Product #2", 66));
        products.add(new Product("Product #3", 89));
        products.add(new Product("Product #4", 77));

        gridView = (GridView) view.findViewById(R.id.gridView);
        gridView.setAdapter(new ProductAdapter(this.getActivity(), products));




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
