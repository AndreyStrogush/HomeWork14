package com.homeworks.factorymethodd.builder;

public class ShopKeeper {
    public static Juice takeOrder(String juiceType) {

        JuiceMaker juiceMaker = null;

        if (juiceType.equalsIgnoreCase(Juice.ORANGE_NAME)) {
            juiceMaker = new OrangeJuice();
        } else if (juiceType.equalsIgnoreCase(Juice.APPLE_NAME)) {
            juiceMaker = new AppleJuice();
        } else {
            System.out.println("Sorry we don't take order for  " + juiceType + "would you take an orange juice?");
            juiceMaker = new OrangeJuice();
        }
        return juiceMaker.makeJuice();
    }
}
