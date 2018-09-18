package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.impl.FrenchFactory;
import com.designpatterns.abstractfactory.impl.ItalianFactory;

import java.util.HashMap;
import java.util.Map;

public abstract class CountryFactory {

    private static Map<String, CountryFactory> factory = new HashMap<>();

    static CountryFactory getFactory(String countryName) throws FoodPreparationException {
        initMapFactory();
        CountryFactory countryFactory = factory.get(countryName.toLowerCase());

        if(countryFactory == null) {
            throw new FoodPreparationException(FoodConstants.COUNTRY_ERROR_DESCRIPTION);
        }

        return countryFactory;
    }

    private static void initMapFactory() {
        if(factory.isEmpty()) {
            factory.put("italy", new ItalianFactory());
            factory.put("french", new FrenchFactory());
        }
    }

    public abstract String getSushi();

    public abstract String getPizza();
}
