package b06.s071;

public class Dog {
	private static final int DEFAULT_WEIGHT = 10;
	private static final String DEFAULT_NAME = "??";
    private static double speed;
    
	int weight;
 String name;

	public Dog() {
		this(DEFAULT_NAME);

	}

	public Dog(String name) {
		this(DEFAULT_WEIGHT, name, speed);
	}

	public Dog(int weight, String name, double speed) {
		this.weight = weight;
		this.name = name;
		Dog.speed = speed;
		
	
	}
	
	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", name=" + name + "]";
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public String getName() {
		return name;
	}
}
