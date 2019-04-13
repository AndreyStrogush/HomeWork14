package com.homeworks.factorymethodd.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class JuiceMaker {
    private Juice juice;

    public final Juice makeJuice() {
        Juice juice = createJuice();
        setJuice(juice);
        setJuiceType();
        setWater();
        setFruit();
        setSugar();
        setIceCube();
        return juice;
    }

    abstract void setJuiceType();

    abstract void setWater();

    abstract void setFruit();

    abstract void setSugar();

    abstract void setIceCube();

    abstract Juice createJuice();
}
