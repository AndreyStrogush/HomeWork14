package com.homeworks.factorymethodd.proxy;

public class RealInternet implements SchoolInternet{
    private String departmentName;

    public RealInternet(String deptName) {
        this.departmentName= deptName;
    }
    @Override
    public void provideInternet() {
        System.out.println("Internet Access provided for Department: " + departmentName);
    }
}
