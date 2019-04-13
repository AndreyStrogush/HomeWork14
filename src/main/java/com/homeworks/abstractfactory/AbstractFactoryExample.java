package com.homeworks.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory LoanFactory = FactoryProvider.getFactory("Loan");

        Account loanOne = LoanFactory.getAccount("Home");
        loanOne.getInterestRate();

        Account loanTwo = LoanFactory.getAccount("Education");
        loanTwo.getInterestRate();

        AbstractFactory accountFactory = FactoryProvider.getFactory("Account");

        Account accountOne = accountFactory.getAccount("Savings");
        accountOne.getInterestRate();

        Account accountTwo = accountFactory.getAccount("Current");
        accountTwo.getInterestRate();
    }
}
