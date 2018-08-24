package com.dpd.designpatterns.facade;


import org.slf4j.LoggerFactory;

public class CPU {
    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CPU.class);
    public void start()
    {
        LOGGER.info("cpu is start...");
    }

    public void shutDown()
    {
        LOGGER.info("CPU is shutDown...");
    }
}
