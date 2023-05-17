package com.javaassignment4.main;

public class LowerHalf {

		public static void main(String[] args){
			int [][]arr = {{10,20,30},{40,50,60},{70,80,90}};
	        for (int i = 0; i < arr.length; i++) {
	        	for (int j = 0; j < arr[i].length; j++) {
	                if (j<=i) {
	                	System.out.print(arr[i][j] + " ");
	                }
	                else
	                {
	                	break;
	                }
	                
	            }
	            System.out.println();
	        }
	    }
	}





				 
				       /*if (arr1[0][1]==20)
						break;
						System.out.println(i+ " ");
				for (int j =0; j <=arr1.length ; j++) {
					if (arr1[1][2]==60)
					break;
					System.out.println(j+ " ");
					//for (int i=1; i <=arr1.length; i++)
					//break ;
					System.out.println(j+ " ");*/
					