package exercisePersonVillainHeroCommonperson;



public class Villain extends Person {
	protected static final int DEFAULT_SHOOTINGPOWER = 100;
	private int shootingpower;
	
	
	Villain(String name) {
		super(name);
		this.shootingpower = DEFAULT_SHOOTINGPOWER;
	}
	
	Villain(String name, int energy) {
		  super (name, energy);
		  this.shootingpower = DEFAULT_SHOOTINGPOWER;	 
	}
	
	Villain(String name, int energy, int power) {
		super(name, energy);
		this.shootingpower = power;
	}
	
		
	public void shoot(Person p) {
		p.ChangeEnergy(-shootingpower);
    }

	@Override
	public String toString() {
		return "Villain [shootingpower=" + shootingpower + "]";
	}
		
	

		
		
			

	}

