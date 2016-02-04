package com.example.illia.BarManager.fragments.Order;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.MenuFragment2;
import com.example.illia.BarManager.utils.MenuInfo.MenuList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wwwmu on 22.01.2016.
 */
public class CreateOrderFragment extends Fragment implements ViewPager.OnPageChangeListener,TabHost.OnTabChangeListener {

    OrderFragmentAdapter orderFragmentAdapter;



    TabHost tabHost;
    View view;
    ViewPager viewPager;

    public void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.create_order_activity, container,false);
        setRetainInstance(true);


        initViewPager();

        initTabHost();


        return view;
    }

    private void initTabHost() {
        tabHost = (TabHost) view.findViewById(R.id.tabHost);
        tabHost.setup();

        String tabname[] = {"Основные блюда","Салаты","Супы","Десерты","Кофе","Чай","Соки и Морсы","Вино","Водка","Пиво","Шампанское"};

        for (int i =0; i<tabname.length; i++){

            TabHost.TabSpec tabSpec;
            tabSpec = tabHost.newTabSpec(tabname[i]);
            tabSpec.setIndicator(tabname[i]);
            tabSpec.setContent(new MyContent(getActivity().getApplicationContext()));
            tabHost.addTab(tabSpec);
        }

        tabHost.setOnTabChangedListener(this);

    }

    private void initViewPager() {

         viewPager = (ViewPager) view.findViewById(R.id.view_pager);


        orderFragmentAdapter = new OrderFragmentAdapter(getChildFragmentManager(),
                EntitySingelton.getInstance().getFragments());

        viewPager.setAdapter(orderFragmentAdapter);
        viewPager.setOffscreenPageLimit(EntitySingelton.getInstance().getFragments().size());
        viewPager.setOnPageChangeListener(this);
    }



    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.scrollView);

        View tabView = tabHost.getTabWidget().getChildAt(position);
        if (tabView != null)
        {
            final int width = horizontalScrollView.getWidth();
            final int scrollPos = tabView.getLeft() - (width - tabView.getWidth()) / 2;
            horizontalScrollView.scrollTo(scrollPos, 0);
        } else {
            horizontalScrollView.scrollBy(positionOffsetPixels, 0);
        }

    }

    @Override
    public void onPageSelected(int position) {
        TabWidget widget = tabHost.getTabWidget();
        int oldFocusability = widget.getDescendantFocusability();
        widget.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
        tabHost.setCurrentTab(position);
        widget.setDescendantFocusability(oldFocusability);

    }
    //viewPager listener
    @Override
    public void onPageScrollStateChanged(int state) {

    }

    //tabhost listener
    @Override
    public void onTabChanged(String tabId) {

        int selectedPage= tabHost.getCurrentTab();
        viewPager.setCurrentItem(selectedPage);

    }


    public class MyContent implements TabHost.TabContentFactory{

        Context context;

        public MyContent(Context mcontext){
            context = mcontext;
        }

        @Override
        public View createTabContent(String tag) {

            View view = new View(context);
            view.setMinimumHeight(0);
            view.setMinimumWidth(0);
            return view;
        }
    }

}
