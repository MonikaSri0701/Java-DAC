package com.javaassignment144.main;

public class PrimeandFibo{
    public synchronized void prime(int num) {
	  try {
	   int i, j;
	   boolean isPrime;
	   for (i= 2; i < 25; i++) {
	   isPrime = true;
	   for (j = 2; j <= i/2; j++) {
	   if (i % j == 0) {
	   isPrime = false;
	   break;
	    }
	      }
	   if (isPrime) {
	   System.out.println(i+ " ");
	    }
	   notify();
		Thread.sleep(1000);						  
	       }    }           
	   catch(InterruptedException exc) {
	   exc.printStackTrace();
 }		System.out.println("Prime ends here"); 
	} 
        public synchronized void Fibonacci(int num) {
        try {
         int n1=0,n2=1,n3,i,count=50;
         System.out.println(n1+""+n2);
         for(i=2;i<count;++i)
         {
        n3=n2+n1;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;
            		
      if (i== 25) {
      wait();
      System.out.println("The remaining Fibonacci series is: ");	
  }
    }
       Thread.sleep(1000);
     } catch (InterruptedException e) {
       e.printStackTrace();
   }
       System.out.println("Fibonacci Series ends here.");           	
    }
}