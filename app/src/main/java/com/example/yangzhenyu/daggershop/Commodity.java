package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
import java.util.List;

/**
 * Commodity could be a single item or a combined items
 * Created by yangzhenyu on 2016/8/26.
 */
public class Commodity {
    List<Item> items;

    Commodity() {
        items = new ArrayList<>();
    }

    Commodity(List<Item> items) {
        this.items = items;
    }

    void addItem(Item item) {
        items.add(item);
    }
}
