package com.homeworks.adapter;

public class AdapterExample {
    public static void main(String args[]) {
        Fighter knight = new Knight();
        Wizard wizard = new Wizard();
        WizardAdapter wizardAdapter = new WizardAdapter(wizard);

        System.out.println("Knight's Action");
        knight.attack();
        knight.defend();
        knight.escape();

        System.out.println("\nWizard's Action");
        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();
    }
}
