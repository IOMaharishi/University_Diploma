package com.example.illia.BarManager.fragments.Order.order_list.custom_config;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ViewGroupCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Order.order_list.OrderEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by wwwmu on 08.02.2016.
 */
public class CustomBarElement extends RelativeLayout {


    TextView order_textView,time_textView,result_textView;
    private View[] viewsInRow;

    public CustomBarElement(Context context, OrderEntity orderEntity) {

        super(context);
        initView(orderEntity);
    }


    public CustomBarElement(Context context, AttributeSet attrs, OrderEntity order) {
        super(context, attrs);

        initView(order);
    }



    public void initView(OrderEntity orderEntity){

        View view = inflate(getContext(),R.layout.custom_bar_element,null);
        view.setVerticalScrollBarEnabled(true);
        order_textView = (TextView) view.findViewById(R.id.order_textView);
        time_textView = (TextView) view.findViewById(R.id.time_textView);
        result_textView = (TextView) view.findViewById(R.id.result_textView);

        StringBuilder order = new StringBuilder();

        for (Map.Entry<String,Integer> entry : orderEntity.getOrder_map().entrySet()){

            order.append(entry.getKey() +" "+ entry.getValue().toString() + "\n");
        }
        order_textView.setText(order);
        result_textView.setText(orderEntity.getResult());
        time_textView.setText(orderEntity.getTime());



        addView(view);
    }




}
