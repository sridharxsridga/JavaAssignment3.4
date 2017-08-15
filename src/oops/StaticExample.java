/*
 * Program to demonstrate Static block, static method and static variable
 */

package oops;

public class StaticExample {
  static{   //Gets loaded first
	System.out.println(" Loading First Static block");
    }

    static int staticIntVariable;    // Declaring static/Class variable
    int withOutStaticVariable;  // Decalring instance variable
   
	public static void main(String[] args) {
		StaticExample staticExample = new StaticExample();
		getStaticIntVariable();      // Calling static method getIntVariable() without creating object
		staticExample.getwithOutStaticVariable();   // Calling non static method using instance of class
		System.out.println(staticIntVariable);   // Value of staticIntVariable is 22 since change is at class level
		System.out.println(staticExample.withOutStaticVariable); //   Value of withOutStaticVariable remains default to 0 since change is done only instance level
	}
	
		
	public static void getStaticIntVariable(){   // method to increment  staticIntVariable by 22
		staticIntVariable =+22;
	
		 
	}
	
	public static void getwithOutStaticVariable(){  // method to increment  withOutStaticVariable by 22
		StaticExample staticExample = new StaticExample();
		staticExample.withOutStaticVariable =+22;
	
		 
	}


}
