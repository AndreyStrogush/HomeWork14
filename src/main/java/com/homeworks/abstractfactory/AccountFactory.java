package com.homeworks.abstractfactory;

public class AccountFactory extends AbstractFactory {
    @Override
    Account getAccount(String type) {
        Account account;
        if (SAVINGS.equalsIgnoreCase(String.valueOf(type))) {
            account = new SavingsAccount();
        } else if (CURRENT.equalsIgnoreCase(String.valueOf(type))) {
            account = new CurrentAccount();
        } else {
            account = new EmptyAccount();
        }
        return account;
    }
}
