package com.javaassignment133.main;
import java.util.ArrayList;

public class CopyElem {
    public static void main(String[] args) {
        ArrayList<Integer> sourceList = new ArrayList<Integer>();
        sourceList.add(10);
        sourceList.add(20);
        sourceList.add(30);
        sourceList.add(40);
        sourceList.add(50);
        
        ArrayList<Integer> destList = new ArrayList<Integer>();
        
        for (Integer element : sourceList) {
            destList.add(element);
        }
        System.out.println("Source ArrayList: " + sourceList);       
        System.out.println("Destination ArrayList: " + destList);
    }
}
