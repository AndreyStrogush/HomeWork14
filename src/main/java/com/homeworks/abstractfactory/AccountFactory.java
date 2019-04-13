package com.homeworks.abstractfactory;

public class AccountFactory extends AbstractFactory {
    @Override
    Account getAccount(String type) {
        Account account = null;
        if (SAVINGS.equalsIgnoreCase(type)) {
            account = new SavingsAccount();
        } else if (CURRENT.equalsIgnoreCase(type)) {
            account = new CurrentAccount();
        }
        return account;
    }
}
