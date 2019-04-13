package com.homeworks.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        AbstractFactory abstractFactory = null;
        if (AbstractFactory.LOAN.equalsIgnoreCase(choice)) {
            abstractFactory = new LoanFactory();
        } else if (AbstractFactory.ACCOUNT.equalsIgnoreCase(choice)) {
            abstractFactory = new AccountFactory();
        }
        return abstractFactory;
    }
}
