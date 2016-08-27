package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
@Module(library = true)
public class ProviderModule {
    @Provides @Singleton List<Provider> provideProviders() {
        List<Provider> providers = new ArrayList<>(1);
        providers.add(new Provider());
        return providers;
    }
}
