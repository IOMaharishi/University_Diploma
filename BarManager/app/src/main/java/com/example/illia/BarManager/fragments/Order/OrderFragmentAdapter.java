package com.example.illia.BarManager.fragments.Order;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by wwwmu on 22.01.2016.
 */
public class OrderFragmentAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragments;

    public OrderFragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
/*
    @Override
    public void destroyItem(View container, int position, Object object) {
        super.destroyItem(container, position, object);
    }*/
}
