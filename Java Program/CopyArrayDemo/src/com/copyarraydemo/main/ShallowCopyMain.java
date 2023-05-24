package com.copyarraydemo.main;
class Department {
    int deptId;
 
    String deptName;

	public Department(int deptId, String deptName) 
	{
		this.deptId = deptId;
		this.deptName = deptName;
	}
 
    
 
   
}
 
class Employee implements Cloneable {
    int empid;
 
    String empname;
 
    Department dept;
 
    
 
    public Employee(int empid, String empname, Department dept) {
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}



	// Default version of clone() method. It creates shallow copy of an object.
 
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ShallowCopyMain 
{

	public static void main(String[] args) 
	{
		 Department dept1 = new Department (01, "IT");
		 
	        Employee emp1 = new Employee (111, "rohan", dept1);
	 
	        Employee emp2 = null;
	 
	        try {
	            // Creating a clone of emp1 and assigning it to emp2
	 
	            emp2 = (Employee) emp1.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	 
	        // Printing the deptname of 'emp1'
	 
	        System.out.println(emp1.dept.deptName); // Output : it
	 
	        // Changing the designation of 'emp2'
	 
	        emp2.dept.deptName = "robotics";
	 
	        // This change will be reflected in original Employee 'emp1'
	 
	        System.out.println(emp1.dept.deptName); // Output : robotics
		

	}

}
