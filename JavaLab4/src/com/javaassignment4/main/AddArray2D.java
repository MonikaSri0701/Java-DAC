package com.javaassignment4.main;

import java.io.IOException;

public class AddArray2D {

	public static void main(String[] args) throws IOException{
		System.out.println("Addition of 2D Array");
		int [][]ar1 = new int [][]{{1,2},{3,4}};
		int [][] ar2 = new int[][] {{5,6},{7,8}};
		
		int [][]ar3 = new int [2][2];
		
		for(int i=0;i<ar1.length;i++) {    
			for(int j=0;j<ar2.length;j++) {    
			ar3[i][j]=ar1[i][j]+ar2[i][j];  
			System.out.print(ar3[i][j]+" ");   
			}
		}
	}
}

