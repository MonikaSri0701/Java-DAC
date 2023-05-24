import java.util.Scanner;

class Prime{
    public static void main(String ar[]) {
        
	Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
	int num = input.nextInt();

	int i = 0;
	int c = 0;
  
	for (i = 1; i <= num; i++) {
		if (num % i == 0)  {
		c++;
		}
  }
		if (c == 2) {	
		System.out.println("num is a Prime number");
  }
  else {
         System.out.println("num is not a Prime number");
  }
    }
}