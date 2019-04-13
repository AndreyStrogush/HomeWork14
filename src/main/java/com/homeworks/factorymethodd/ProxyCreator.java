package com.homeworks.factorymethodd;

import com.homeworks.factorymethodd.proxy.ProxyInternet;
import com.homeworks.factorymethodd.proxy.SchoolInternet;

public class ProxyCreator extends Creator {
    @Override
    public void factoryMethod() {
        SchoolInternet internet = new ProxyInternet("Accounts");
        internet.provideInternet();
    }
}
