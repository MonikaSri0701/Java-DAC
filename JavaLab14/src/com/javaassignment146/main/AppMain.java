package com.javaassignment146.main;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AppMain {
    public static void main(String[] args) throws ClassNotFoundException {
    	Employee emp = new Employee();
    	Class obj = emp.getClass();
    	
    	System.out.println("Emp refernece belong to class: " + obj.getName());
    	System.out.println("Class name: " + obj.getSimpleName());
    	
    	Class superClass = obj.getSuperclass();
        System.out.println("Superclass of Employee is: " + superClass.getName());
        
        Field[] empFields = obj.getFields();
		
		for(Field f : empFields ){
		f.setAccessible(true);
		System.out.println(f.getName() + " : " + f.getType());
		}
	
		Constructor[] arr = obj.getConstructors();
		for(Constructor c : arr) {
		System.out.println("Constructor has : " 
					+ c.getParameterCount());
				
		if(c.getParameterCount() > 0) {
		Class[] paramTypes = c.getParameterTypes();
					
		for(Class param : paramTypes )
		System.out.println(param.getName());
    }
		}
		System.out.println("Methods:");
        Method[] methods = obj.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
    }
}
	
  



























