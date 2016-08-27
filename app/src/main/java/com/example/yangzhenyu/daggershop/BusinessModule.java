package com.example.yangzhenyu.daggershop;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
@Module(library = true)
public class BusinessModule {
    @Provides @Singleton public Commodity provideCommdity(){
        return new Commodity();
    }
}
