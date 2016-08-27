package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
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
        offers.add(new Offer());
        return offers;
    }
}
