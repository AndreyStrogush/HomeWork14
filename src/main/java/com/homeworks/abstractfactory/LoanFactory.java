package com.homeworks.abstractfactory;

public class LoanFactory extends AbstractFactory {
    @Override
    Account getAccount(String type) {
        Account account = null;
        if (HOME.equalsIgnoreCase(type)) {
            account = new HomeLoan();
        } else if (EDUCATION.equalsIgnoreCase(type)) {
            account = new EducationLoan();
        }
        return account;
    }
}
