package exercisePersonVillainHeroCommonperson;

public abstract class Person {
	protected static final int DEFAULT_ENERGY = 10 ;
	public static final String DEFAULT_NAME = "NOME";
	
    int energy;
    String name;

    
    public Person() {
    	this(DEFAULT_NAME, DEFAULT_ENERGY);
    	
	}
    

	public Person(String name, int energy) {
		this.energy = energy;
		this.name = name;
			
	}

    public void ChangeEnergy(int value) {
    	energy = energy + value;   	
    }
    
    public boolean isAlive(Person person) {
		boolean status = true;
		return status;
	}
	
	public String getName() {
		return name;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public Person(String defaultName) {
		// TODO Auto-generated constructor stub
	}
	

}
