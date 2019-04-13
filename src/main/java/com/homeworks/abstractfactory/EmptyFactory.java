package com.homeworks.abstractfactory;

public class EmptyFactory extends AbstractFactory {
    @Override
    Account getAccount(String type) {
        Account account = new EmptyAccount();
        return account;
    }
}
