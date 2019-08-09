package b06.s072;

public class Main {
	public static void main(String[] args) {
        Dog[] dogs = new Dog[4];
		dogs[0]= new Dog("Tom", 2.42);
        dogs[1] = new Dog ("Zar", 135);
        dogs[2] = new Dog ("Laser", 119);
        dogs[3] = new Dog ("Zorro", 98);
        
        for (Dog dog : dogs) {
        System.out.println(dog.toString());
    }
        double sfastest = dogs[0].getSpeed();
        Dog fastest = dogs[0];
        for (int i = 1; i < dogs.length; i++); {
        	// TODO
			if(dogs[i].getSpeed() > fastest.getSpeed()) {
        
        fastest = dogs[i];
        sfastest =  dogs[i].getSpeed(i);
        
             }
	}
	System.out.println(fastest.getName() + sfastest);
	
}
}

