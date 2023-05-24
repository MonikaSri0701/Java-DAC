package com.javaassignment11.main;
import java.io.File;

public class FMain {

	public static void main(String[] args) {

		File f1 = new File(
				"C:\\Users\\ASUS\\OneDrive\\Desktop\\exc_handle.txt");
				
		System.out.println("name of file: " + f1.getName());

			System.out.println("path of file:" +f1.getPath());
			System.out.println("parent folder of file: " + f1.getParent());
			System.out.println("size of file: "+ f1.length());
			System.out.println("is f1 a file: " +f1.isFile());
			System.out.println("is f1 a folder : " +f1.isDirectory());
			System.out.println("does fi exist in your system: " + f1.exists()); 
			System.out.println("is f1 readable : " +f1.canRead());
			System.out.println("is f1 writable : " +f1.canWrite());

	}
}


