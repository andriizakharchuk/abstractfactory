package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.impl.FoodType;

class FoodPreparation {

    String prepareFood(String countryName, String dishName) {
        try {
            CountryFactory factory = CountryFactory.getFactory(countryName);
            return FoodType.valueOf(dishName.toUpperCase()).prepareFood(factory);
        } catch (FoodPreparationException e) {
            return e.getMessage();
        } catch (IllegalArgumentException e) {
            return FoodConstants.DISH_ERROR_DESCRIPTION;
        }
    }
}
