package com.example.illia.BarManager.fragments.Order;

/**
 * Created by wwwmu on 24.01.2016.
 */
public class Entity {


    private  int count = 0;
    private String title;

    public Entity(String title)
    {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void decCount(){
        count--;
    }
    public void incCount(){
        count++;
    }
}
