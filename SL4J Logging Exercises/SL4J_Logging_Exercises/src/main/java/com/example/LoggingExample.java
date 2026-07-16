package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.error("This is an error message");

        logger.warn("This is a warning message");

        logger.trace("Trace Message");

        logger.debug("Debug Message");

        logger.info("Information Message");

        logger.warn("Warning Message");

        logger.error("Error Message");

        logger.trace("Program started");

        logger.debug("Loading configuration");

        logger.info("Application started");

        logger.warn("Memory usage is high");

        logger.error("Database connection failed");
    }

}
