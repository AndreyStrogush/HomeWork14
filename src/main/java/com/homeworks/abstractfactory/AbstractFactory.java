package com.homeworks.abstractfactory;

public abstract class AbstractFactory {
    protected static final String LOAN = "Loan";
    protected static final String ACCOUNT = "Account";
    protected static final String SAVINGS = "Savings";
    protected static final String CURRENT = "Current";
    protected static final String HOME = "Home";
    protected static final String EDUCATION = "Education";

    abstract Account getAccount(String type);
}
