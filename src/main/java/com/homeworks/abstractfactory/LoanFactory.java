package com.homeworks.abstractfactory;

public class LoanFactory extends AbstractFactory {
    @Override
    Account getAccount(String type) {
        Account account = null;
        if (HOME.equalsIgnoreCase(String.valueOf(type))) {
            account = new HomeLoan();
        } else if (EDUCATION.equalsIgnoreCase(String.valueOf(type))) {
            account = new EducationLoan();
        } else {
            account = new EmptyAccount();
        }
        return account;
    }
}
