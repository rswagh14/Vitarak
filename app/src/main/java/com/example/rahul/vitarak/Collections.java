package com.example.rahul.vitarak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.rahul.vitarak.Adapters.CollectionList;
import com.example.rahul.vitarak.Adapters.CollectionListAdapter;

import java.util.ArrayList;

public class Collections extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView collection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        collection = ((ListView)findViewById(R.id.list_collection));




        ArrayList<CollectionList> collectionLists = new ArrayList<>();
        collectionLists.add(new CollectionList(1l,"Mahesh Jadhav","C 1001 Welworth Tincelton, Bavdhan, Pune",
                                                "500000",R.drawable.user));
        collectionLists.add(new CollectionList(2l,"Mahesh Jadhav","C 1001 Welworth Tincelton, Bavdhan, Pune",
                "500000",R.drawable.user));
        collectionLists.add(new CollectionList(3l,"Mahesh Jadhav","C 1001 Welworth Tincelton, Bavdhan, Pune",
                "500000",R.drawable.user));
        collectionLists.add(new CollectionList(4l,"Mahesh Jadhav","C 1001 Welworth Tincelton, Bavdhan, Pune",
                "500000",R.drawable.user));
        collectionLists.add(new CollectionList(5l,"Mahesh Jadhav","C 1001 Welworth Tincelton, Bavdhan, Pune",
                "500000",R.drawable.user));
        collectionLists.add(new CollectionList(6l,"Mahesh Jadhav","C 1001 Welworth Tincelton, Bavdhan, Pune",
                "500000",R.drawable.user));

        CollectionListAdapter adapter = new CollectionListAdapter(this, collectionLists);

        collection.setAdapter(adapter);

        collection.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 1:
                        startActivity(new Intent(Collections.this,CustomerPayment.class));
                }

            }
        });









    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.collections, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
