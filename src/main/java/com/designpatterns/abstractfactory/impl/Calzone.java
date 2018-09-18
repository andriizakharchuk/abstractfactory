package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.Pizza;

public class Calzone implements Pizza {

    public String getPizza(String countryName) {
        return "This pizza Calzone is made in " + countryName + ".";
    }
}
