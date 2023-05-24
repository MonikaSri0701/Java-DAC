import java.util.Scanner;

class Grade{
    public static void main(String ar[]) {
        
	Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subject: ");
	int numsubject = input.nextInt();

	int totalmarks = 0;
	int i=0;
  
	for (i = 1; i <= numsubject; i++) {
		
	System.out.print("Enter marks for subject " + i + ": ");
            int marks = input.nextInt();
            totalmarks += marks;
        }
int avg = (int) totalmarks / numsubject;

        char grade;
        if (avg >= 80) {
            grade = 'A';
        } else if (avg >= 60) {
            grade = 'B';
        } else if (avg >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }
	
	System.out.println("Average marks: " +avg);
	System.out.println("Grade: " + grade);

    }
}