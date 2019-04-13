package com.homeworks.factorymethodd.builder;

public class AppleJuice extends JuiceMaker {
    Juice createJuice() {
        return new Juice();
    }

    public void setWater() {
        System.out.println("Step 1 : Adding water into the juicer");
        getJuice().setWater(Juice.APPLE_WATER);
    }

    public void setFruit() {
        System.out.println("Step 2 : Adding fruit into the juicer");
        getJuice().setFruit(Juice.APPLE_FRUIT);
    }

    void setSugar() {
        System.out.println("Step 3 : Adding sugar into the juicer");
        getJuice().setSugar(Juice.APPLE_SUGAR);
    }

    void setIceCube() {
        System.out.println("Step 4 : Adding 7 to 8 numbers of ice cubes into the juicer");
        getJuice().setIceCube(Juice.APPLE_ICE_CUBE);
    }

    void setJuiceType() {
        System.out.println("apple");
        getJuice().setJuiceName(Juice.APPLE_NAME);
    }
}
