import java.util.Scanner;
class Binary {
		
		public static void main(String arg[]){ 
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        int decimal = Integer.parseInt(binaryString, 2);

        System.out.println("The decimal equivalent of " + binaryString + " is " + decimal);
    }
}