package b04;

public class S44Chicken {
	static final double DEFAULT_WEIGHT = 1.0; 
	static final String DEFAULT_NAME = "Unknown";
	String name;
	double weight;
	boolean female;
	
	 
	 
	 public S44Chicken(String name) {
		
		 this.name = name;
		 this.weight = DEFAULT_WEIGHT;
		 this.female = true;
		 
	 }
		 
	
		 public S44Chicken(String name, double weight) {
				
			 this.name = name;
			 this.weight = weight;
			 this.female = true;

			 
		 
				 
	
	}
		 public S44Chicken(String name, double weight, boolean female) {
				
			 this.name = name;
			 this.weight = weight;
			 this.female = female;
			 
		 }
			 
			 
			 
	public S44Chicken() {
		this.name = DEFAULT_NAME;
		this.weight = DEFAULT_WEIGHT;
		
	}


	@Override
	public String toString() {
		return "S44Chicken [name=" + name + ", weight=" + weight + ", female=" + female + "]";
	}

}
