package com.designpatterns.abstractfactory.impl;

import com.designpatterns.abstractfactory.CountryFactory;

public enum FoodType {
    PIZZA {
        @Override
        public String prepareFood(CountryFactory factory) {
            return factory.getPizza();
        }
    },
    SUSHI{
        @Override
        public String prepareFood(CountryFactory factory) {
            return factory.getSushi();
        }
    };

    public abstract String prepareFood(CountryFactory factory);
}

