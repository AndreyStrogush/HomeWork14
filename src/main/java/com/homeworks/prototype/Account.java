package com.homeworks.prototype;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class Account implements Cloneable {
    private static final Logger LOGGER = Logger.getLogger(Account.class);

    abstract public void accountType();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            LOGGER.error("CloneNotSupportedException" + e.getMessage());
        }
        return clone;
    }
}
