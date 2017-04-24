package com.example.rahul.vitarak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.rahul.vitarak.Adapters.CollectionList;
import com.example.rahul.vitarak.Adapters.CollectionListAdapter;
import com.example.rahul.vitarak.Adapters.CollectionPaymentAdapter;
import com.example.rahul.vitarak.Adapters.CollectionPaymentList;

import java.util.ArrayList;

public class CustomerPayment extends AppCompatActivity {

    ListView orderlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_payment);


        orderlist = ((ListView)findViewById(R.id.orderlist));




        ArrayList<CollectionPaymentList> collectionPaymentLists = new ArrayList<>();
        collectionPaymentLists.add(new CollectionPaymentList(1l,"Product 1","500 ltr | 50 Crate","30000",R.drawable.user));
        collectionPaymentLists.add(new CollectionPaymentList(2l,"Product 1","500 ltr | 50 Crate","30000",R.drawable.user));
        collectionPaymentLists.add(new CollectionPaymentList(3l,"Product 1","500 ltr | 50 Crate","30000",R.drawable.user));
        collectionPaymentLists.add(new CollectionPaymentList(4l,"Product 1","500 ltr | 50 Crate","30000",R.drawable.user));
        collectionPaymentLists.add(new CollectionPaymentList(5l,"Product 1","500 ltr | 50 Crate","30000",R.drawable.user));
        collectionPaymentLists.add(new CollectionPaymentList(6l,"Product 1","500 ltr | 50 Crate","30000",R.drawable.user));

        CollectionPaymentAdapter adapter = new CollectionPaymentAdapter(this, collectionPaymentLists);

        orderlist.setAdapter(adapter);

        orderlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               /* switch (position){
                    case 1:
                        startActivity(new Intent(Collections.this,CustomerPayment.class));
                }*/

            }
        });

    }
}
