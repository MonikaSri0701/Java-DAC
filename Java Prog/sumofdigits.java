import java.util.Scanner;

class Digit {
    public static void main(String ar[]) {
        
	Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");

        int num = input.nextInt();

        int firstDigit = num / 10000;
        int secondLastDigit = (num % 100) / 10;
        int sum = firstDigit + secondLastDigit;

        System.out.println("The sum of the first and second last digit is " + sum);
    }
}