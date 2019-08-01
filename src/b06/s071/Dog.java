package b06.s071;

public class Dog {
	private static final int DEFAULT_WEIGHT = 10;
	private static final String DEFAULT_NAME = "??";
    
	int weight;
 String name;

	public Dog() {
		this(DEFAULT_NAME);

	}

	public Dog(String name) {
		this(DEFAULT_WEIGHT, name);
	}

	public Dog(int weight, String name) {
		this.weight = weight;
		this.name = name;
		
		
	
	}
	
	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", name=" + name + "]";
	}
	

	
	
}
