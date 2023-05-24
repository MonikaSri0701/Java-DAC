class ReportGrade {
public static void main(String ar[]) 
	{
		
	System.out.println("            Report Card ");
	System.out.println("Student Name: " + ar[0]);
	System.out.println("Course Name: " + ar[1]);
	System.out.println("Enter the marks of subject Maths: " + ar[2]);
	System.out.println("Enter the marks of subject Physics: " + ar[3]);
	System.out.println("Enter the marks of subject Chemistry: " + ar[4]);
		
		
	int Maths =Integer.parseInt(ar[2]);
	int Physics =Integer.parseInt(ar[3]);
	int Chemistry =Integer.parseInt(ar[4]);
	float avg = (Maths+Physics+Chemistry)/3;
	
		
		String grade;
		if (avg>80)
		{
		grade ="A";
		}
		else
		{
		grade ="B";
		}

	
	System.out.println("Average marks: " +avg);
	System.out.println("Grade: " + grade);

	}
}