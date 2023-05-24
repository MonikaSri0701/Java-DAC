package com.practiceset.main;
public class SpecificValue {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        int value = 3;
        boolean containsValue = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                containsValue = true;
                break;
        }
    }       
        if (containsValue) {
          System.out.println("The array contains the value " + value);
     } else {
          System.out.println("The array does not contain the value " + value);
        }
    }
}
