class Fibonacci 
{
	    public static void main(String[] args) {
	        int count = 20; 
	        
	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < count; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }	    
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}

