package com.example.illia.BarManager.fragments.Menu;

import android.support.v4.app.Fragment;

public class CoreMenuData {


    private String title,price;
    private int imageUrl;
    private Fragment fragment;


    public CoreMenuData(String title, int imageUrl, Fragment fragment){

        this.title = title;
        this.imageUrl = imageUrl;
        this.fragment = fragment;
    }

    public CoreMenuData(String title, int imageUrl, String price){

        this.title = title;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }


    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
