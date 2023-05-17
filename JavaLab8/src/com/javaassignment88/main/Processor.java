package com.javaassignment88.main;

abstract class Processor {
    int data;

    void showData() {
        System.out.println("Value of Data: " + data);
    }

    abstract void process();
}

