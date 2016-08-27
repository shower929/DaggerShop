package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by yangzhenyu on 2016/8/27.
 */
public class TaiwanWareHouse implements WareHouse {
    private final List<Provider> providers;
    private Map<String, List<Item>> goods;

    @Inject
    TaiwanWareHouse(List<com.example.yangzhenyu.daggershop.Provider> providers) {
        this.providers = providers;
    }

    public int getItemStock(String name){
        /**
         * Get stock in warehouse first
         */
        if (goods != null) {
            List<Item> items = goods.get(name);
            if (items != null && items.size() != 0) {
                return items.size();
            }
        }

        return 0;
    }

    public void replenishment(String itemName, int count) {
        if (goods == null) {
            goods = new HashMap(10);
        }

        List<Item> imported = new ArrayList<Item>(count);

        for (com.example.yangzhenyu.daggershop.Provider provider: providers) {
            List<String> catalog = provider.getCatalog();
            for (String name : catalog) {
                if (name.equals(itemName)) {
                    while(provider.getStocks(itemName) > 0 && imported.size() < count) {
                        imported.add(provider.obtainItem(itemName));
                    }
                    goods.put(name, imported);
                }
            }
        }
    }
}
