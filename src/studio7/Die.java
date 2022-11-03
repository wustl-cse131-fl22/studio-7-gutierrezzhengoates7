package studio7;

public class Die {


	private int n;
	
	public Die(int sides) {
		this.n = sides;
	}
	
	public int randomNum() {
		
		int roll = (int)(Math.random()*n)+1;
		return roll;
	}
	
	public static void main(String[] args) {
	Die die1 = new Die(6);
		System.out.println(die1.randomNum());

	}

}
