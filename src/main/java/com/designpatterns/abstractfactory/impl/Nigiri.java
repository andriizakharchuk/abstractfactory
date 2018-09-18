package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.Sushi;

public class Nigiri implements Sushi {

    public String getSushi(String countryName) {
        return "This sushi Nigiri is made in " + countryName + ".";
    }
}
