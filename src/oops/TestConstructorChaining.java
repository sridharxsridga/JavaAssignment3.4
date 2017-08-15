package oops;

public class TestConstructorChaining {

	public static void main(String[] args) {
		Circle circle = new Circle();   // calling default constructor
		Circle circle1 = new Circle("Orange",false);    //calling  constructor with two arguments
		Circle circle2 = new Circle(12,"Blue",true);   // calling  constructor with three arguments
		System.out.println(circle);   // printing object
		System.out.println(circle1);   // printing object
		System.out.println(circle2);    // printing object
		
	}

}
