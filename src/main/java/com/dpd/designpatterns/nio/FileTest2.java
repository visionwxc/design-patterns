package com.dpd.designpatterns.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileTest2 {
    public static void method(){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("D:\\Dennis wu\\java\\file.txt","rw");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            int byteRead = fileChannel.read(byteBuffer);
            System.out.println(byteRead);
            while (byteRead != -1){
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()){
                    System.out.print((char)byteBuffer.get());
                }
                byteBuffer.compact();
                byteRead = fileChannel.read(byteBuffer);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if(randomAccessFile != null){
                    randomAccessFile.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        method();
    }
}
