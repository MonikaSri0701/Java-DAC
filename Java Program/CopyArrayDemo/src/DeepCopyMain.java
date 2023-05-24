class Department implements Cloneable{
    int depId;
 
    String name;
 
    
    public Department(int depId, String name) {
		this.depId = depId;
		this.name = name;
	}


	//Default version of clone() method.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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



	// Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();
 
        emp.dept = (Department) dept.clone();
 
        return emp;
    }
}
 
public class DeepCopyMain {
    public static void main(String[] args) {
        Department dept1 = new Department(01,"it");
 
        Employee emp1 = new Employee(111, "rohan", dept1);
 
        Employee emp2 = null;
 
        try {
            // Creating a clone of emp1 and assigning it to emp2
 
            emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        // Printing the designation of 'emp1'
 
        System.out.println(emp1.dept.name); // Output : it
 
        // Changing the designation of 'emp2'
 
        emp2.dept.name = "robotics";
 
        // This change will not be reflected in original Employee 'emp1'
 
        System.out.println(emp1.dept.name); // Output : it
    }
}

