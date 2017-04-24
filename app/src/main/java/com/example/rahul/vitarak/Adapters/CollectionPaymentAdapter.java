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

public class CollectionPaymentAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<CollectionPaymentList> collectionPaymentLists;
    private LayoutInflater layoutInflater;

    public CollectionPaymentAdapter(Context context, ArrayList<CollectionPaymentList> collectionPaymentLists) {
        this.context = context;
        this.collectionPaymentLists = collectionPaymentLists;

        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return collectionPaymentLists.size();
    }

    @Override
    public Object getItem(int position) {
        return collectionPaymentLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return collectionPaymentLists.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        if(convertView == null) view = layoutInflater.inflate(R.layout.customerpayment_listview,null,false);
        else view = convertView;


        ((ImageView)view.findViewById(R.id.img_productpic))
                .setImageResource(collectionPaymentLists.get(position).getProductpic());

        ((TextView)view.findViewById(R.id.txt_productname))
                .setText(collectionPaymentLists.get(position).getProductName());

        ((TextView)view.findViewById(R.id.txt_ltrqty))
                .setText(collectionPaymentLists.get(position).getLtrQty());

        ((TextView)view.findViewById(R.id.txt_amount))
                .setText(collectionPaymentLists.get(position).getAmount());



        return view;
    }
}
