package com.dpd.designpatterns.facade;

import org.slf4j.LoggerFactory;

public class Memory {
    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Memory.class);
    public void start()
    {
        LOGGER.info("Memory is start...");
    }

    public void shutDown()
    {
        LOGGER.info("Memory is shutDown...");
    }
}
