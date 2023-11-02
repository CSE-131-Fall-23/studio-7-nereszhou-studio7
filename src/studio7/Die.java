package studio7;

public class Die {
	
	private int n;
	
	public Die (int randNum) {
		n = rando();
		this.n = randNum;
	}
	
	public int rando() {
		return (int)(Math.random()*n + 1) ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die dice1 = new Die(7);
		System.out.println(dice1.rando());
   
	}

}
