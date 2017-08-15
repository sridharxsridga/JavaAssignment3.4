/*
 *  The class Circle holds attribute radius and derive other attributes from class Shape by extending it.
 *  This is implemented to show the demo for constructor chaining using this and super keyword
 * 
 */



package oops;

public class Circle extends Shape {
private double radius=2.0;

	Circle(){      // default constructor
	this(5.0);     //Constructor Chaining using this keyword 
	
}
 
public Circle(double radius){     // constructor with one argument

	this.radius = radius;
	
}


public Circle(String color, boolean filled){    // constructor with two argument

	super(color,filled);   // Constructor Chaining using super keyword, Calling base class constructor
}

public Circle(double radius ,String color, boolean filled){    // // constructor with three argument

	super(color,filled);   // Constructor Chaining using super keyword , Calling base class constructor
	this.radius = radius;
}


public double getRadius() {    // Getter method for Radius
	return radius;
}

public void setRadius(double radius) {  // Setter method for Radius
	this.radius = radius;
}


public String toString(){   // Override Object class method toString() , is used to display information
	return " Radius :" +  getRadius() +", Color : "+ getColor() + ",  Filled :"+ isFilled();
}
}
