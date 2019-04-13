package com.homeworks.factorymethodd.builder;

public class OrangeJuice extends JuiceMaker {
    Juice createJuice() {
        return new Juice();
    }

    public void setWater() {
        System.out.println("Step 1 : Adding water into the juicer");
        getJuice().setWater(Juice.ORANGE_WATER);
    }

    public void setFruit() {
        System.out.println("Step 2 : Adding fruit into the juicer");
        getJuice().setFruit(Juice.ORANGE_FRUIT);
    }

    void setSugar() {
        System.out.println("Step 3 : Adding sugar into the juicer");
        getJuice().setSugar(Juice.ORANGE_SUGAR);
    }

    void setIceCube() {
        System.out.println("Step 4 : Adding 5 to 6 numbers of ice cubes into the juicer");
        getJuice().setIceCube(Juice.ORANGE_ICE_CUBE);
    }

    void setJuiceType() {
        System.out.println("orange");
        getJuice().setJuiceName(Juice.ORANGE_NAME);
    }
}
