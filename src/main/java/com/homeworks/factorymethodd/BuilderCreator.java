package com.homeworks.factorymethodd;

import com.homeworks.factorymethodd.builder.ShopKeeper;

public class BuilderCreator extends Creator {
    private static final String JUICE_NAME_ONE = "orange";
    private static final String JUICE_NAME_TWO = "apple";

    @Override
    public void factoryMethod() {
        ShopKeeper.takeOrder(JUICE_NAME_ONE);
        ShopKeeper.takeOrder(JUICE_NAME_TWO);
    }
}
