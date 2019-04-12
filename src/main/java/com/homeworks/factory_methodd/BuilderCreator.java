package com.homeworks.factory_methodd;

import com.homeworks.factory_methodd.builder.Juice;
import com.homeworks.factory_methodd.builder.ShopKeeper;

public class BuilderCreator extends Creator {
    @Override
    public void factoryMethod() {
        Juice orange = ShopKeeper.takeOrder("orange");
        Juice apple = ShopKeeper.takeOrder("apple");
    }
}
