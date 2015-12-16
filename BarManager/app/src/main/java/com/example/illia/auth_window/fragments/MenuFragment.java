package com.example.illia.auth_window.fragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;

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
import com.example.illia.auth_window.R;

/**
 * Created by Illia on 11/25/15.
 */
public class MenuFragment extends Fragment {


    FragmentManager fragmentManager;
    private Button button;

    private  View view ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      fragmentManager = this.getActivity().getSupportFragmentManager();

        view = inflater.inflate(R.layout.menu_activity, container, false);

        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(oclBtnOk);



        return view;
    }





    View.OnClickListener oclBtnOk = new View.OnClickListener() {


        @Override
        public void onClick(View v) {

            fragmentManager.beginTransaction().replace(R.id.frame_container, new MenuFragment2()).commit();
        }
    };




}
