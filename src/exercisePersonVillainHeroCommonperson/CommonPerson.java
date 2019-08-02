package exercisePersonVillainHeroCommonperson;

public class CommonPerson extends Person {
	
	public CommonPerson(String name, int energy) {
		super(name, energy);
	}
	
	public CommonPerson() {
		this(DEFAULT_NAME, DEFAULT_ENERGY);
	}

	@Override
	public String toString() {
		return "CommonPerson []";
	}
	
	
}
