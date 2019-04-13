package com.homeworks.factorymethodd.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Juice {
    protected static final Integer APPLE_WATER = 50;
    protected static final Integer APPLE_FRUIT = 6;
    protected static final Integer APPLE_SUGAR = 20;
    protected static final Integer APPLE_ICE_CUBE = 8;
    protected static final String APPLE_NAME = "apple";
    protected static final Integer ORANGE_WATER = 40;
    protected static final Integer ORANGE_FRUIT = 4;
    protected static final Integer ORANGE_SUGAR = 10;
    protected static final Integer ORANGE_ICE_CUBE = 6;
    protected static final String ORANGE_NAME = "orange";

    private int water;
    private int fruit;
    private int sugar;
    private int iceCube;
    private String juiceName;
}
