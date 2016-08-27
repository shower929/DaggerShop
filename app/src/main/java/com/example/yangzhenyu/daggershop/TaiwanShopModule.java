package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
@Module(
        injects = Shop.class,
        includes = {BusinessModule.class, TaiwanWareHouseModule.class}
)

public class TaiwanShopModule {
    @Provides @Singleton List<Offer> provideOffers() {
        List<Offer> offers = new ArrayList<>(5);
        Commodity commodity = new Commodity();
        commodity.addItem(new Item("Potato chips"));
        Offer.Builder offerBuilder = new Offer.Builder();
        offerBuilder.setCommodity(commodity)
                .setPrice(50)
                .setStart("2016-08-27 00:00")
                .setExpire("2016-09-03 24:00");
        offers.add(offerBuilder.build());
        return offers;
    }
}
