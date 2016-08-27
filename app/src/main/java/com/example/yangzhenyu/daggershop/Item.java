package com.example.yangzhenyu.daggershop;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
public class Item implements Cloneable{
    String name;
    public Item(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
