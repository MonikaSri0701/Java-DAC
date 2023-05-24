package com.javaassignment133.main;
import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayListUsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> sourceList = new ArrayList<Integer>();
        sourceList.add(10);
        sourceList.add(20);
        sourceList.add(30);
        sourceList.add(40);
        sourceList.add(50);
        
        ArrayList<Integer> destList = new ArrayList<Integer>(sourceList.size());
        Collections.copy(destList, sourceList);
        
        System.out.println("Source ArrayList: " + sourceList);   
        System.out.println("Destination ArrayList: " + destList);
    }
}

