package exercisePersonVillainHeroCommonperson;



public class Villain extends Person {
	protected static final double DEFAULT_SHOOTINGPOWER = 100;
	private double shootingpower;
	
	public Villain() {
		  
    }
	public Villain(String name, double shootingpower) {
		this(name, shootingpower);
	}
	public Villain(String name, int energy, double shootingpower) {
		  super (name);
		  this.shootingpower = shootingpower;	 
	}
	  
	public double getShootingpower() {
		return shootingpower;
		


    	 
     }
		

		
		
			

	}
}
