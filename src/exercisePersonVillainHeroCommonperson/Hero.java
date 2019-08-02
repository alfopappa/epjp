package exercisePersonVillainHeroCommonperson;


public class Hero extends Person {
    protected static final int DEFAULT_BONUSPOWER = 100;
	private int bonuspower = 0;

	public Hero() {
	}
	
	public Hero(String name, int power, int bonuspower) {
		super(name, bonuspower);
		this.bonuspower = bonuspower;
	}
	
	public boolean arrest(Person person) {
		boolean arrestedStatus = false;
		return arrestedStatus;
	}

	@Override
	public String toString() {
		return "Hero [bonuspower=" + bonuspower + "]";
	}

}
	
