package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.CountryFactory;

public class ItalianFactory extends CountryFactory {

    private static final String COUNTRY_NAME = "Italy";

    @Override
    public String getSushi() {
        return new Sashimi().getSushi(COUNTRY_NAME);
    }

    @Override
    public String getPizza() {
        return new Margherita().getPizza(COUNTRY_NAME);
    }
}
