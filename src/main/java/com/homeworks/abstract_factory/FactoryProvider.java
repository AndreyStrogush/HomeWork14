package com.homeworks.abstract_factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        AbstractFactory abstractFactory = null;
        if ("Loan".equalsIgnoreCase(choice)) {
            abstractFactory = new LoanFactory();
        } else if ("Account".equalsIgnoreCase(choice)) {
            abstractFactory = new AccountFactory();
        }
        return abstractFactory;
    }
}
