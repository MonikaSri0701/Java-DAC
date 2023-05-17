package com.javaassignment5.main;

import java.io.IOException;

import com.javaassignment5.entity.Grader;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int score;
        do {
            System.out.print("Enter score (0-100): ");
            score = sc.nextInt();
        } while (score < 0 || score > 100);
		        
				Grader gd = new Grader(score);
	
		        System.out.println("Your grade is: "+ 
		        gd.LetterGrade(score));
	}
}

