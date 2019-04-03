package com.decorator.javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args){
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new FileInputStream("E:\\myproject\\java-design-demo\\decorator-demo\\src\\main\\java\\com\\decorator\\javaIO\\text.txt"));
            while ((c=in.read())>0){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
