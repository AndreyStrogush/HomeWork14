package com.homeworks.factorymethodd;

import com.homeworks.factorymethodd.builder.Juice;
import com.homeworks.factorymethodd.builder.ShopKeeper;

public class BuilderCreator extends Creator {
    private static final String JUICE_NAME_ONE = "orange";
    private static final String JUICE_NAME_TWO = "apple";
    
    @Override
    public void factoryMethod() {
        Juice orange = ShopKeeper.takeOrder(JUICE_NAME_ONE);
        Juice apple = ShopKeeper.takeOrder(JUICE_NAME_TWO);
    }
}
