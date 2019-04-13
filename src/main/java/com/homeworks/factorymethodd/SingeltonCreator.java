package com.homeworks.factorymethodd;

import com.homeworks.factorymethodd.singleton.SingletonProduct;

public class SingeltonCreator extends Creator {
    @Override
    public void factoryMethod() {
        SingletonProduct singletonProduct = SingletonProduct.getInstance();
        System.out.println("Singletone hash code: " + singletonProduct.hashCode());
    }
}
