package com.example.illia.BarManager.fragments.Order.order_list;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwwmu on 08.02.2016.
 */
public class OrderEntity {


    private Map<String,Integer>  order_map = new HashMap<>();



    public Map<String, Integer> getOrder_map() {
        return order_map;

    }

    public void setElement(String key,Integer element){
        order_map.put(key, element);
    }


    public String getResult() {


        int result = 0;

        for (Map.Entry<String,Integer> entry : order_map.entrySet()){
            result += entry.getValue();
        }

        return String.valueOf(result);
    }

    public String getTime(){

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        return dateFormat.format(date).toString();

    }
}
