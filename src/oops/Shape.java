/*
 *  The class Shape holds attribute color and filled . This class is extended by class Circle
 *  This is implemented to show the demo for constructor chaining using this and super keyword
 * 
 */



package oops;

public class Shape {

	private String color;
	private boolean filled;
	
	Shape(){  //default constructor
		
		color="red";
		filled = true;
	}
	
	Shape(String color, boolean filled){    // constructor with two argument
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {   // Getter methodfor color
		return color;
	}

	public void setColor(String color) {   // Setter methodfor color
		this.color = color;
	}

	public boolean isFilled() {  // Getter methodfor filled
		return filled;
	}

	public void setFilled(boolean filled) {   // Setter methodfor filled
		this.filled = filled;
	}
	
	public String toString(){ //  Override Object class method toString() , is used to display information
		return " Color : + "+  getColor() + " Filled :"+isFilled();
	}
	
}
