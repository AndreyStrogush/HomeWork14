package com.homeworks.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        AbstractFactory abstractFactory = null;
        if (AbstractFactory.LOAN.equalsIgnoreCase(String.valueOf(choice))) {
            abstractFactory = new LoanFactory();
        } else if (AbstractFactory.ACCOUNT.equalsIgnoreCase(String.valueOf(choice))) {
            abstractFactory = new AccountFactory();
        } else {
            abstractFactory = new EmptyFactory();
        }
        return abstractFactory;
    }
}
