package com.learn.java;

import com.learn.java.impl.MyTestInterface;

/**
 * Created by chinna on 5/15/16.
 */
public class SimpleHello implements MyTestInterface {
    public static void main(String[] args) {
        SimpleHello hello = new SimpleHello();
       hello.address("cinna", 2143243242, "2324324 jhdfgij");
        printTwo();

    }

    public static void printOne(){
        System.out.println("this is print one");
    }
    public static void printTwo(){
        printOne();
        printOne();
    }






    public  String address(String name, int phone, String street) {
        String address = name + phone + street;
        System.out.println(address);
        return address;
    }
}
