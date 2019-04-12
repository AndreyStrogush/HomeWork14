package com.homeworks.factory_methodd;

import com.homeworks.factory_methodd.proxy.ProxyInternet;
import com.homeworks.factory_methodd.proxy.SchoolInternet;

public class ProxyCreator extends Creator {
    @Override
    public void factoryMethod() {
        SchoolInternet internet = new ProxyInternet("Accounts");
        internet.provideInternet();
    }
}
