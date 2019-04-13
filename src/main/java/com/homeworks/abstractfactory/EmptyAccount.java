package com.homeworks.abstractfactory;

public class EmptyAccount implements Account {
    @Override
    public void getInterestRate() {
        System.out.println("With is empty account (to avoid NPE)");
    }
}
