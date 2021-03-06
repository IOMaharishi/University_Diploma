package com.example.illia.BarManager.fragments.Order;

import android.support.v4.app.Fragment;

import com.example.illia.BarManager.utils.MenuInfo.MenuList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wwwmu on 27.01.2016.
 */
public class EntitySingelton {
    /**
     * It list of fragments wich will be show, when you will create order in ViewPager
     */
    private static EntitySingelton entitySingelton = new EntitySingelton();
    private RowEntity[] entities;
    List<Fragment> fragments;

    public EntitySingelton(){

        fragments = new ArrayList<Fragment>(Arrays.asList(
            fillingEntity(MenuList.getMain_food()),
            fillingEntity(MenuList.getSalat()),
            fillingEntity(MenuList.getSoups()),
            fillingEntity(MenuList.getDesserts()),
            fillingEntity(MenuList.getCoffee()),
            fillingEntity(MenuList.getTee()),
            fillingEntity(MenuList.getJuice()),
            fillingEntity(MenuList.getVine()),
            fillingEntity(MenuList.getVodka()),
            fillingEntity(MenuList.getBeer()),
            fillingEntity(MenuList.getChampagne())
        ));

    }




    public static EntitySingelton getInstance(){
        return  entitySingelton;
    }

    public FragmentPatternViewPager fillingEntity(String [] list){

        FragmentPatternViewPager pattern;

        entities = new RowEntity[list.length];


        for (int i =0 ; i< list.length; i++){

            entities[i] = new RowEntity(list[i]);
        }

         pattern = new FragmentPatternViewPager(entities);


        return pattern;
    }


    public List<Fragment> getFragments(){
        return fragments;
    }





}
