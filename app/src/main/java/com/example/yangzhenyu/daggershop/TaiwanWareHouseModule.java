package com.example.yangzhenyu.daggershop;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangzhenyu on 2016/8/27.
 */
@Module(
        complete = false, library = true,
        includes = ProviderModule.class
)
public class TaiwanWareHouseModule {
    @Provides @Singleton WareHouse provideWareHouse(TaiwanWareHouse wareHouse) {
        //WareHouse wareHouse = new WareHouse();
        wareHouse.replenishment("Potato chips", 10);
        wareHouse.replenishment("Cola", 5);
        return wareHouse;
    }
}
