package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.Pizza;

public class Margherita implements Pizza {

    public String getPizza(String countryName) {
        return "This pizza Margherita is made in " + countryName + ".";
    }
}
