package com.javaassignment4.main;

public class ConcArray {

	public static void main(String[] args) {
		int[] ar1 = {2, 4, 6, 8, 10};
        int[] ar2 = {1, 3, 5, 7, 9};

        int totalLength = ar1.length + ar2.length;

        int[] concatArr = new int[totalLength];
        
        for (int i = 0; i < ar1.length; i++) {
            concatArr[i] = ar1[i];
        }

        for (int i = 0; i < ar2.length; i++) {
        	concatArr[ar1.length + i] = ar2[i];
        }

        for (int i = 0; i < concatArr.length; i++) {
            System.out.print(concatArr[i] + " ");
        }
    }
}

