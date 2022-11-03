package studio7;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double initlength, double initwidth) {
		length=initlength;
		width=initwidth;
	}

	public double Area(double length,double width) {
		return length*width;
	}

	public double Parameter(double length,double width) {
		return (2*length)+(2*width);
	}

	public boolean compare(Rectangle compare) {
		if (this.Area(length, width) > compare.Area(3.0, 5.2)) {
			return true; 
		}
		else 
		{
			return false; 
		}

	}

	public boolean square(double length, double width) {
		if (length == width) {
			return true; 
		}
		else {
			return false; 
		}
	}
	public static void main(String[] args) {

	}
}
