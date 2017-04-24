package com.example.rahul.vitarak.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahul.vitarak.R;

import java.util.ArrayList;

/**
 * Created by Rahul on 4/23/2017.
 */

public class CollectionListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<CollectionList> collectionLists;
    private LayoutInflater inflater;

    public CollectionListAdapter(Context context, ArrayList<CollectionList> collectionLists) {
        this.context = context;
        this.collectionLists = collectionLists;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return collectionLists.size();
    }

    @Override
    public Object getItem(int position) {
        return collectionLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return collectionLists.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        if(convertView == null) view = inflater.inflate(R.layout.collection_listview,null,false);
        else view = convertView;


        ((ImageView)view.findViewById(R.id.img_profilepic))
                .setImageResource(collectionLists.get(position).getProfilepic());

        ((TextView)view.findViewById(R.id.txt_customername))
                .setText(collectionLists.get(position).getName());

        ((TextView)view.findViewById(R.id.txt_customeraddress))
                .setText(collectionLists.get(position).getAddress());

        ((TextView)view.findViewById(R.id.txt_amount))
                .setText(collectionLists.get(position).getAmount());



        return view;
    }
}
