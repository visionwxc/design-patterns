package com.dpd.designpatterns.facade;

import org.slf4j.LoggerFactory;

/**
 * 外观模式： 提供统一的对外接口，不暴露内部的子系统的实现，类似于微服务中的网关的作用
 */
public class Computer {

    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Computer.class);
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        LOGGER.info("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        LOGGER.info("Computer start end");
    }

    public void shutDown(){
        LOGGER.info("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        LOGGER.info("Computer shutDown end...");
    }

}
