package com.homeworks.adapter;

public class Knight implements Fighter {
    @Override
    public void attack() {
        System.out.println("Knight attacks!!");
    }

    @Override
    public void defend() {
        System.out.println("Knight defends...");
    }

    @Override
    public void escape() {
        System.out.println("Run Knight run...");
    }
}
