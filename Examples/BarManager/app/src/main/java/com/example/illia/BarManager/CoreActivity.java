package com.example.illia.BarManager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.illia.BarManager.utils.Utils;
import com.mikepenz.materialdrawer.Drawer;

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


        System.gc();

    }



}

