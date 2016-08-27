package com.example.yangzhenyu.daggershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.ObjectGraph;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ObjectGraph objectGraph = ObjectGraph.create(TaiwanShopModule.class);
        Shop shop = objectGraph.get(Shop.class);
        shop.listOffers();
    }


}
