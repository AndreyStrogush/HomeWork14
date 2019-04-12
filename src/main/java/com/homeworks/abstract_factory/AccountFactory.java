package com.homeworks.abstract_factory;

public class AccountFactory extends AbstractFactory {
    @Override
    Account getAccount(String type) {
        Account account = null;
        if ("Savings".equalsIgnoreCase(type)) {
            account = new SavingsAccount();
        } else if ("Current".equalsIgnoreCase(type)) {
            account = new CurrentAccount();
        }
        return account;
    }
}
