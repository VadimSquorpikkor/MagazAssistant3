package com.squorpikkor.app.magazassistant3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Prod> prodList;
    ListView prodListView;
    ProdListAdapter prodListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prodList = new ArrayList<>();
        prodList.add(new Prod("SomeJuice", 2, 3));
        prodList.add(new Prod("SomeJuice2", 1, 1));
        prodList.add(new Prod("SomeJuice3", 3, 2));

        prodListView = findViewById(R.id.prodListView);
        prodListAdapter = new ProdListAdapter(this, R.layout.prod_item_list, prodList);
        prodListView.setAdapter(prodListAdapter);


    }
}
