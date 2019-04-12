package com.homeworks.abstract_factory;

public class CurrentAccount implements Account {
    @Override
    public void getInterestRate() {
        System.out.println("Current Account Interest Rate = 5.0% pa");
    }
}
