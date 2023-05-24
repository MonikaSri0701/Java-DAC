package com.javaassignment91.main;

public class WelcomeMessage {
	 private void welcome() {
		    System.out.println("Welcome Private");
		  }
		  
		  public void welcome1() {
			  welcome();
		    System.out.println("Welcome1 Public");
		  }
		  
		  protected void welcome2() {
		    System.out.println("Welcome2 Protected");
		  }
		  
		  void welcome3() {
		    System.out.println("Welcome3 Default");
		  }
		  
}
