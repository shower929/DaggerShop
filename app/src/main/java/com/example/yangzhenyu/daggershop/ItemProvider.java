package com.example.yangzhenyu.daggershop;

import javax.inject.Provider;

/**
 * Created by yangzhenyu on 2016/8/26.
 */

public class ItemProvider implements Provider<Item>{

    @Override
    public Item get() {
        return new Item("Food");
    }
}

