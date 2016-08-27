package com.example.yangzhenyu.daggershop;

import android.util.Log;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
public class Shop {
    @Inject List<Offer> offers;
    @Inject WareHouse warehouse;

    public void listOffers() {
        for (Offer offer : offers) {
            Log.d("Dagger", "Offer: " + offer.commodity
                    + ", price: " + offer.price
                    + ", start: " + offer.start
                    + ", expire: " + offer.expire);
        }
    }

    public void viewOffer(Offer offer) {

        Log.d("Dagger", "Offer: " + offer.commodity
                + ", price: " + offer.price
                + ", start: " + offer.start
                + ", expire: " + offer.expire
                + ", stock: " + getItemStock(offer.commodity.item.name));
    }

    private int getItemStock(String name) {
        return warehouse.getItemStock(name);
    }
}
