package com.dpd.designpatterns.nio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FileTest1 {
    public static void method(String filePath){
        InputStream inputStream = null;
        long start = System.currentTimeMillis();
        try{
            inputStream = new BufferedInputStream(new FileInputStream(filePath));
            byte[] buf = new byte[1024];
            int byteRead = inputStream.read(buf);
            while (byteRead != -1){
                for(int i = 0 ; i < byteRead ; i++ ){
                    System.out.print((char)buf[i]);
                }
                byteRead = inputStream.read(buf);
            }
            long end = System.currentTimeMillis();
            System.out.println();
            System.out.println("spend total time " + (end - start) + " ms");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                method("D:\\Dennis wu\\java\\file.txt");
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1");
            }
        };
        thread.start();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                method("D:\\Dennis wu\\java\\file.txt");
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2");
            }
        };
        thread1.start();
        new Thread(() -> {

        }).start();
    }
}
