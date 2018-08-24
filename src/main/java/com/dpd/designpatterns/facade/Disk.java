package com.dpd.designpatterns.facade;

import org.slf4j.LoggerFactory;

public class Disk {

    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Disk.class);
    public void start()
    {
        LOGGER.info("Disk is start...");
    }

    public void shutDown()
    {
        LOGGER.info("Disk is shutDown...");
    }
}
