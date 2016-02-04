package com.androidsources.recyclerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up the toolbar
        Toolbar toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        List<RowData> rowListItem = getRowList();
        layoutManager = new LinearLayoutManager(MainActivity.this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<RowData> getRowList(){

        List<RowData> currentItem = new ArrayList<RowData>();
        currentItem.add(new RowData("Ali Connors","Mobile, 53 minutes ago", R.drawable.profile1));
        currentItem.add(new RowData("Jonathan Lee","Work, 53 minutes ago",R.drawable.profile2));
        currentItem.add(new RowData("Sandra Adams","United States, 2 days ago", R.drawable.profile3));
        currentItem.add(new RowData("Trever Hansen","India, 3 days ago", R.drawable.profile4));
        currentItem.add(new RowData("Britta holt","Dubai, 5 days ago", R.drawable.profile5));
        currentItem.add(new RowData("Ali Connors","Mobile, 53 minutes ago", R.drawable.profile1));
        currentItem.add(new RowData("Jonathan Lee","Work, 53 minutes ago",R.drawable.profile2));
        currentItem.add(new RowData("Sandra Adams","United States, 2 days ago", R.drawable.profile3));
        currentItem.add(new RowData("Trever Hansen","India, 3 days ago", R.drawable.profile4));
        currentItem.add(new RowData("Britta holt","Dubai, 5 days ago", R.drawable.profile5));
        currentItem.add(new RowData("Britta holt","Dubai, 5 days ago", R.drawable.profile5));
        currentItem.add(new RowData("Ali Connors","Mobile, 53 minutes ago", R.drawable.profile1));
        currentItem.add(new RowData("Jonathan Lee","Work, 53 minutes ago",R.drawable.profile2));
        currentItem.add(new RowData("Sandra Adams","United States, 2 days ago", R.drawable.profile3));
        currentItem.add(new RowData("Trever Hansen","India, 3 days ago", R.drawable.profile4));
        currentItem.add(new RowData("Britta holt","Dubai, 5 days ago", R.drawable.profile5));
        return currentItem;
    }
}
