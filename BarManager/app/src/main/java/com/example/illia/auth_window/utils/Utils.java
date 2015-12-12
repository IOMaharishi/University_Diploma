package com.example.illia.auth_window.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;

import com.example.illia.auth_window.R;
import com.example.illia.auth_window.fragments.MenuFragment;
import com.example.illia.auth_window.fragments.MessageFragment;
import com.example.illia.auth_window.fragments.OrdersFragment;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;

import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileSettingDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
/**
 * Created by Illia on 11/25/15.
 */
public class Utils {


    public static Drawer createCommonDrawer(final AppCompatActivity activity, Toolbar toolbar) {

        Drawer drawer = new DrawerBuilder()
                .withActivity(activity)
                .withHeader(R.layout.drawer_header)
                .withToolbar(toolbar)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.messages).withIcon(FontAwesome.Icon.faw_android).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.tables).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.orders).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(3),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.menu).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(4)
                ).build();
               /* .withOnDrawerListener(new Drawer.OnDrawerListener() {
                    @Override
                    public boolean equals(Object o) {
                        return super.equals(o);
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        //Toast.makeText(MainActivity.this, "onDrawerOpened", Toast.LENGTH_SHORT).show();
                        hideSoftKeyboard(activity);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        //Toast.makeText(MainActivity.this, "onDrawerClosed", Toast.LENGTH_SHORT).show();
                    }
                })
                .build();*/


        drawer.setOnDrawerItemClickListener(handlerOnClick(drawer, activity));

        return drawer;
    }

    public static Drawer.OnDrawerItemClickListener handlerOnClick(final Drawer drawerResult, final AppCompatActivity activity) {
        return new Drawer.OnDrawerItemClickListener() {
            @Override
            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

/*
                switch (drawerItem.getIdentifier()){

                    case 1:activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuFragment()).commit();
                    case 2:activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuFragment()).commit();
                    case 3:activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new OrdersFragment()).commit();
                    case 4:activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuFragment()).commit();

                }
*/
                if (drawerItem != null) {

                    if (drawerItem.getIdentifier() == 1) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MessageFragment()).commit();
                    } else if (drawerItem.getIdentifier() == 2) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuFragment()).commit();
                    } else if (drawerItem.getIdentifier() == 3) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new OrdersFragment()).commit();
                    }else if (drawerItem.getIdentifier() == 4) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuFragment()).commit();
                    }

                    /* else if (drawerItem.getIdentifier() == 70) {
                        // Rate App
                        try {
                            Intent int_rate = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + activity.getApplicationContext().getPackageName()));
                            int_rate.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            activity.getApplicationContext().startActivity(int_rate);
                        } catch (Exception e) {

                        }
                    }*/

                }
                return false;
            }
        };
    }
}
