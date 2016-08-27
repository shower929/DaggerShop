package com.example.yangzhenyu.daggershop;

import java.util.Date;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
public class Offer {
    public static class Builder {
        Commodity commodity;
        double price;
        String start;
        String expire;

        Builder setCommodity(Commodity commodity) {
            this.commodity = commodity;
            return this;
        }

        Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        Builder setStart(String start) {
            this.start = start;
            return this;
        }

        Builder setExpire(String expire) {
            this.expire = expire;
            return this;
        }

        Offer build(){
            return new Offer(commodity, price, start, expire);
        }
    }

    Commodity commodity;
    double price;
    String start;
    String expire;

    Offer(Commodity commodity, double price, String start, String expire) {
        this.commodity = commodity;
        this.price = price;
        this.start = start;
        this.expire = expire;
    }
}
