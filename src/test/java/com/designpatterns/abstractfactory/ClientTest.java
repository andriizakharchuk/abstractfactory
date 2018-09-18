package com.designpatterns.abstractfactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ClientTest {

    private FoodPreparation foodPreparation;

    @BeforeClass
    public void setUp() {
        foodPreparation = new FoodPreparation();
    }

    @Test
    public void testFrenchCalzone() {
        String preparedFood = foodPreparation.prepareFood("french", "pizza");
        assertEquals(preparedFood, "This pizza Calzone is made in French.");
    }

    @Test
    public void testItalianMargherita() {
        String preparedFood = foodPreparation.prepareFood("italy", "pizza");
        assertEquals(preparedFood, "This pizza Margherita is made in Italy.");
    }

    @Test
    public void testFrenchNigiri() {
        String preparedFood = foodPreparation.prepareFood("french", "sushi");
        assertEquals(preparedFood, "This sushi Nigiri is made in French.");
    }

    @Test
    public void testItalianSashimi() {
        String preparedFood = foodPreparation.prepareFood("italy", "sushi");
        assertEquals(preparedFood, "This sushi Sashimi is made in Italy.");
    }

    @Test
    public void testIncorrectCountry() {
        String preparedFood = foodPreparation.prepareFood("wrongcountry", "sushi");
        assertEquals(preparedFood, "You put incorrect country name.");
    }

    @Test
    public void testIncorrectDish() {
        String preparedFood = foodPreparation.prepareFood("italy", "wrongdish");
        assertEquals(preparedFood, "You put incorrect dish name.");
    }
}
