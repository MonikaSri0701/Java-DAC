package com.javaassignment113.main;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class CopyF {
	
	private File srcFile = new File (
			"C:\\Users\\ASUS\\OneDrive\\Desktop\\file.txt");
	private File destFile = new File ("C:\\Users\\ASUS\\OneDrive\\Desktop\\MainProg\\file.txt");

			public void copydata() {
				try(FileInputStream fin =new FileInputStream(srcFile);
						BufferedInputStream bin =new BufferedInputStream(fin);
						FileOutputStream fout =new FileOutputStream(destFile);
						BufferedOutputStream bout =new BufferedOutputStream(fout)) {
				
					byte[] arr = new byte[1024];
					int count = 0;
					while((count = bin.read(arr)) > 0) {
						bout.write(arr, 0, count);
					}
				}
				catch(IOException exc) {
					exc.printStackTrace();
				}
				}
	}
