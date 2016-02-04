package ua.com.customcontainer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wwwmu on 24.01.2016.
 */
public class CustomEl extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_element_of_list);
        // Handle Toolbar
     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tittle");

        //Create the drawer
        result = new DrawerBuilder(this)
                //this layout have to contain child layouts
                .withRootView(R.id.drawer_container)
                .withToolbar(toolbar)
                .withActionBarDrawerToggleAnimated(true)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Some String 1").withIcon(FontAwesome.Icon.faw_home),
                        new PrimaryDrawerItem().withName("Some String 2").withIcon(FontAwesome.Icon.faw_gamepad),
                        new PrimaryDrawerItem().withName("Some String 3").withIcon(FontAwesome.Icon.faw_eye),
                        new SectionDrawerItem().withName("Some String 4"),
                        new SecondaryDrawerItem().withName("Some String 5").withIcon(FontAwesome.Icon.faw_cog),
                        new SecondaryDrawerItem().withName("Some String 6").withIcon(FontAwesome.Icon.faw_question).withEnabled(false),
                        new SecondaryDrawerItem().withName("Some String 7").withIcon(FontAwesome.Icon.faw_github),
                        new SecondaryDrawerItem().withName("Some String 8").withIcon(FontAwesome.Icon.faw_bullhorn)
                )
                .withSavedInstance(savedInstanceState)
                .build();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //add the values which need to be saved from the drawer to the bundle
        outState = result.saveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        //handle the back press :D close the drawer first and if the drawer is closed close the activity
        if (result != null && result.isDrawerOpen()) {
            result.closeDrawer();
        } else {
            super.onBackPressed();
        }*/
    }




}
