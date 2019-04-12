package com.homeworks.factory_methodd;

import com.homeworks.factory_methodd.singleton.SingletonProduct;

public class SingeltonCreator extends Creator {
    @Override
    public void factoryMethod() {
        SingletonProduct singletonProduct = SingletonProduct.getInstance();
        System.out.println("Singletone hash code: " + singletonProduct.hashCode());
    }
}
