package com.example.illia.BarManager.utils;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.illia.BarManager.R;
import com.example.illia.BarManager.fragments.Menu.MenuFragment;
import com.example.illia.BarManager.fragments.MessageFragment;
import com.example.illia.BarManager.fragments.Order.CreateOrderFragment;
import com.example.illia.BarManager.fragments.OrdersFragment;
import com.example.illia.BarManager.fragments.TablesFragment;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;

import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

/**
 * Created by Illia on 11/25/15.
 */
public class Utils {



    public static Drawer createCommonDrawer(final AppCompatActivity activity, Toolbar toolbar) {

        Drawer   drawer = new DrawerBuilder(activity)
                .withRootView(R.id.drawer_container)
                .withHeader(R.layout.drawer_header)
                .withToolbar(toolbar)
                .withActionBarDrawerToggleAnimated(true)

                   .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.messages).withIcon(FontAwesome.Icon.faw_android).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.tables).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.orders).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(3),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.menu).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(4)
                ).build();



         drawer.setOnDrawerItemClickListener(handlerOnClick(drawer, activity));


        return drawer;
    }

    public static Drawer.OnDrawerItemClickListener handlerOnClick(final Drawer drawerResult, final AppCompatActivity activity) {
        return new Drawer.OnDrawerItemClickListener() {
            @Override
            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {


                if (drawerItem != null) {

                    if (drawerItem.getIdentifier() == 1) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MessageFragment()).commit();
                    } else if (drawerItem.getIdentifier() == 2) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new TablesFragment()).commit();
                    } else if (drawerItem.getIdentifier() == 3) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new OrdersFragment()).commit();
                    } else if (drawerItem.getIdentifier() == 4) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MenuFragment()).commit();
                    }


                }
                return false;
            }
        };
    }


}
