package com.example.yangzhenyu.daggershop;

import java.util.Date;

import javax.inject.Inject;

/**
 * Created by yangzhenyu on 2016/8/26.
 */
public class Offer {
    @Inject Commodity commodity;
    @Inject Price price;
    @Inject Date start;
    @Inject Date expire;
}
