package com.example.illia.BarManager.fragments.Order.order_list;

/**
 * Created by wwwmu on 03.02.2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;


import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Order.order_list.custom_config.CustomBarElement;

import java.util.List;

/**
 * This adapter attached to GridView
 */
public class OrderListAdapter extends BaseAdapter {

    private Context context;
    private List<OrderEntity> orderEntities;
    private OrderEntity lastModify;


    public OrderListAdapter(Context context, List<OrderEntity> orderEntities) {
        this.context = context;
        this.orderEntities = orderEntities;

    }

    @Override
    public int getCount() {
        return orderEntities.size();
    }

    @Override
    public Object getItem(int position) {
        return orderEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


//        LayoutInflater inflater = LayoutInflater.from(context);
        View rel;
        if (convertView == null) {
            rel= new CustomBarElement(context,orderEntities.get(position));


        } else {
            rel = convertView;
        }
        rel.setId(position);

        return rel;
    }
}