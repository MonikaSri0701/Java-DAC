package com.javaassignment114.main;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserial {
		private File file = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\mobobject.dat");
		
public void writeData() {
	try(FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout)){
		Employee e1 = new Employee(101, "Monika", "abc");
		Employee e2 = new Employee(102, "Ankit", "pqr");
		Employee e3 = new Employee(101, "Kunal", "xyz");
				
		out.writeObject(e1);
		out.writeObject(e2);
		out.writeObject(e3);
				
	System.out.println("Objects stored in a file");			
			}
		catch (IOException e) {
		e.printStackTrace(); }
		}
public void readData() {
		try (FileInputStream fin = new FileInputStream(file); 
		ObjectInputStream oin = new ObjectInputStream(fin)) {
			while(true) {
			Employee emp = (Employee) oin.readObject(); 
			System.out.println(emp.getId() + ": " +
			emp.getName());  }
		}
			catch (EOFException exc) {
			System.out.println("reading objects from file is over");
			}
			catch (IOException | ClassNotFoundException exc) {
			exc.printStackTrace();
			}
	}
		
	}
