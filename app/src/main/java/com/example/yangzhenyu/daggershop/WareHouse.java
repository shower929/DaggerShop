package com.example.yangzhenyu.daggershop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by yangzhenyu on 2016/8/26.
 */

public interface WareHouse {
    int getItemStock(String name);
    void replenishment(String itemName, int count);
}
