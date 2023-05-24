package com.javaassignment114.main;
import java.io.Serializable;

class Employee implements Serializable {
	private static final long serialVersionUID = 3662453965440404931L;
		private int id;
	    private String name;
	    private String dept;

	    public Employee(int id, String name, String dept) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDept() {
	        return dept;
	    }
	}

