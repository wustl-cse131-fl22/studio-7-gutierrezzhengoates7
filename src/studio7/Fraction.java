package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int num,int denom) {
		this.numerator=num;
		this.denominator=denom;
	}
	
	public int numAdd(int num2) {
		return numerator + num2;
	}
	
	public int denomAdd(int denom2) {
		return denominator + denom2;
	}
	public String addFraction(int num2,int denom2) {
		return numAdd(num2)+ "/" + denomAdd(denom2);
	}
	
	
	
	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(6,3);
		System.out.println(fraction1.addFraction(4,5));
	}
	

}
