package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.utils.ConsoleManager;

public class Client {

    private static final ConsoleManager CONSOLE_MANAGER = new ConsoleManager();

    public static void main(String[] args) {
        CONSOLE_MANAGER.sendToConsole("Enter country (Italy or French):");
        String countryName = CONSOLE_MANAGER.readFromConsole();

        CONSOLE_MANAGER.sendToConsole("Enter dish name (pizza or sushi):");
        String dishName = CONSOLE_MANAGER.readFromConsole();

        FoodPreparation foodPreparation = new FoodPreparation();
        String preparedFood = foodPreparation.prepareFood(countryName, dishName);
        CONSOLE_MANAGER.sendToConsole(preparedFood);
    }
}
