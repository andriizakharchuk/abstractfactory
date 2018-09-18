package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.Sushi;

public class Sashimi implements Sushi {

    public String getSushi(String countryName) {
        return "This sushi Sashimi is made in " + countryName + ".";
    }
}
