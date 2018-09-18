package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.CountryFactory;

public class FrenchFactory extends CountryFactory {

    private static final String COUNTRY_NAME = "French";

    public String getSushi() {
        return new Nigiri().getSushi(COUNTRY_NAME);
    }

    public String getPizza() {
        return new Calzone().getPizza(COUNTRY_NAME);
    }
}
