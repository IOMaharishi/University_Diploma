package com.example.illia.BarManager.fragments.Order.order_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwwmu on 06.02.2016.
 * This List of component wich will be show in GridView
 */
public class OrderListSingelton {

    private static OrderListSingelton orderListSingelton = new OrderListSingelton();
    private List<OrderEntity> order_list = new ArrayList<OrderEntity>();

    public static OrderListSingelton getInstance(){
        return orderListSingelton;
    }


    public List<OrderEntity> getOrder_list() {
        return order_list;
    }
}
