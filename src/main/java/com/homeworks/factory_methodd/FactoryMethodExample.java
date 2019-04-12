package com.homeworks.factory_methodd;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator[] creators = {new SingeltonCreator(), new ProxyCreator(), new BuilderCreator()};
        for (Creator creator : creators) {
            creator.factoryMethod();
        }
    }
}
