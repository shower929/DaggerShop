package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
public class Provider {
    private static final int NUM_CATALOG = 2;
    private List<String> catalog;
    private Map<String, List<Item>> goods;

    public synchronized List<String> getCatalog() {
        if (catalog == null) {
            catalog = new ArrayList<String>(NUM_CATALOG);
            catalog.add("Potato chips");
            catalog.add("Cola");
        }
        return catalog;
    }

    public synchronized int getStocks(String name) {

        if (goods != null) {
            List<Item> items = goods.get(name);
            if (items != null && items.size() > 0) {
                return items.size();
            }
        }

        if (goods == null) {
            goods = new HashMap<>(NUM_CATALOG);
            List<Item> potatoChips = new ArrayList<Item>(3);
            potatoChips.add(new Item("Potato chips 1"));
            potatoChips.add(new Item("Potato chips 2"));
            potatoChips.add(new Item("Potato chips 3"));
            goods.put("Potato chips", potatoChips);

            List<Item> colas = new ArrayList<Item>(3);
            colas.add(new Item("Cola 1"));
            colas.add(new Item("Cola 2"));
            colas.add(new Item("Cola 3"));
            goods.put("Cola", colas);
        }

        return goods.get(name).size();
    }

    public Item obtainItem(String name) {
        try {
            return (Item) goods.get(name).remove(0).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
