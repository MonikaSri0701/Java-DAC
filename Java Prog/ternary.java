class Ternary 
{
	public static void main(String arr[])
	{

		int a =Integer.parseInt(arr[0]);
		int b =Integer.parseInt(arr[1]);
		int c =Integer.parseInt(arr[2]);

		int d= ((a > b) ? (a > c ? a : c) : (b > c ? b : c));

		System.out.print("Greatest of all 3 number is: " + d);
	
	}
}