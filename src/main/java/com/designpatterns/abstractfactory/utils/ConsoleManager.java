package com.designpatterns.abstractfactory.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class ConsoleManager {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public void sendToConsole(String message) {
        log.info(message);
    }

    public String readFromConsole() {
        try {
            return READER.readLine();
        } catch (IOException e) {
            log.info("Cannot read user input. Detailed message: {}", e.getMessage());
        }

        return null;
    }
}
