package com.example.illia.auth_window;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.illia.auth_window.utils.Utils;
import com.mikepenz.fontawesome_typeface_library.*;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;
/*
 * Created by Illia on 11/16/15.
 */
public class CoreActivity extends AppCompatActivity {

    private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.core_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = Utils.createCommonDrawer(CoreActivity.this, toolbar);
        drawer.openDrawer();

    }
/*

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //add the values which need to be saved from the drawer to the bundle
        outState = drawer.saveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        //handle the back press :D close the drawer first and if the drawer is closed close the activity
        if (drawer != null && drawer.isDrawerOpen()) {
            drawer.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }


*/


/*       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);


        // Инициализируем Navigation Drawer
        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withSavedInstance(savedInstanceState)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.messages).withIcon(FontAwesome.Icon.faw_android),
                        new PrimaryDrawerItem().withName(R.string.tables).withIcon(FontAwesome.Icon.faw_cog),
                        new PrimaryDrawerItem().withName(R.string.orders).withIcon(FontAwesome.Icon.faw_cog),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.menu).withIcon(FontAwesome.Icon.faw_cog)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem instanceof Nameable) {

                        switch (((Nameable) drawerItem).getName().getText(CoreActivity.this)){
                            case "Сообщения": Toast.makeText(CoreActivity.this, ((Nameable) drawerItem).getName().getText(CoreActivity.this), Toast.LENGTH_SHORT).show();
                                break;
                            case "Столы": Toast.makeText(CoreActivity.this, ((Nameable) drawerItem).getName().getText(CoreActivity.this), Toast.LENGTH_SHORT).show();
                                break;
                            case "Заказы": Toast.makeText(CoreActivity.this, ((Nameable) drawerItem).getName().getText(CoreActivity.this), Toast.LENGTH_SHORT).show();
                                break;
                            case "Меню":Intent intent = new Intent(CoreActivity.this, MenuActivity.class);
                                startActivity(intent);
                                break;

                        }
                        }

                        return false;
                    }
                }).build();

    }
*/



}

