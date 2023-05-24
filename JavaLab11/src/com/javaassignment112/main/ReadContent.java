package com.javaassignment112.main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

	public void readCharbyChar() {
		File f1 = new File(
				"C:\\Users\\ASUS\\OneDrive\\Desktop\\file.txt");
		try(FileReader reader = new FileReader(f1)) {
			String str = " ";
			int c= 0;
			while((c = reader.read()) != -1) {
				str =str +(char)c;
			}
			System.out.println("data read from file: " + str);
			}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}
	public void readLinebyLine() {
		File f1 = new File(
				"C:\\Users\\ASUS\\OneDrive\\Desktop\\file.txt");
		try(FileReader reader = new FileReader(f1);
				BufferedReader br = new BufferedReader(reader)) {
			String str =" ";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}}
			catch(IOException exc) {
				exc.printStackTrace();
			}
	}
	public void readinBulk() {
		File f1 = new File(
				"C:\\Users\\ASUS\\OneDrive\\Desktop\\file.txt");
		try(FileReader reader = new FileReader(f1);
				BufferedReader br = new BufferedReader(reader)) {
			char[] arr = new char[50];
			int count =0;
			System.out.println("data read from file: ");
			while((count = br.read(arr)) > 0) {
				String str = new String(arr, 0,count);
				System.out.println(str);
			}}
			catch(IOException exc) {
				exc.printStackTrace();
			}
	}			
}


