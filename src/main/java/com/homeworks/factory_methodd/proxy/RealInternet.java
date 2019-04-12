package com.homeworks.factory_methodd.proxy;

public class RealInternet implements SchoolInternet{
    private String departmentName;
    public RealInternet(String detpName) {
        this.departmentName= detpName;
    }
    @Override
    public void provideInternet() {
        System.out.println("Internet Access provided for Department: "+ departmentName);
    }
}
