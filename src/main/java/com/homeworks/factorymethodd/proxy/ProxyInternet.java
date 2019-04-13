package com.homeworks.factorymethodd.proxy;

public class ProxyInternet implements SchoolInternet {
    private static final String COMPUTER = "Computer";
    private String departmentName;
    private RealInternet  realobject;

    public ProxyInternet(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void provideInternet() {
        if (!getDepartment(departmentName).equals(COMPUTER))
        {
            realobject= new RealInternet(departmentName);
            realobject.provideInternet();
        }
        else
        {
            System.out.println("No Internet access provided. Your Department is Computer");
        }
    }

    public String getDepartment(String dept1Name) {
        return "Accounts";
    }
}
