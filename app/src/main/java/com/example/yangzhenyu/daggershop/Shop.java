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

    public void viewOffer(int index) {
        Offer offer = offers.get(index);
        StringBuilder sb = new StringBuilder("Offer{");
        sb.append(offer.price)
                .append(",").append(offer.price)
                .append(",").append(offer.start)
                .append(",").append(offer.expire);
        for (Item item: offer.commodity.items) {
            sb.append(",").append("Item{ ").append(item.name)
                    .append(",").append(getItemStock(item.name))
                    .append("}");
        }
        Log.d("Dagger", sb.toString());
    }

    private int getItemStock(String name) {
        return warehouse.getItemStock(name);
    }

    public int getOfferCount() {
        return offers.size();
    }
}
