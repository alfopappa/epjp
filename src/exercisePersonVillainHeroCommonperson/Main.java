package exercisePersonVillainHeroCommonperson;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;




public class Main {
	public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<String, Person>();
        Map<String, Villain> villains = new HashMap<String, Villain>();
        Map<String, Hero> heroes = new HashMap<String, Hero>();
        Map<String, CommonPerson> commonpersons = new HashMap<String, CommonPerson>();
            
           persons.put("Alfonso", new Villain("Alfonso", 700, 98));
           persons.put("Michele", new Villain("Michele", 600, 98));
           persons.put("Maurizio", new Hero("Maurizio", 500, 23));
           persons.put("Giacomo", new CommonPerson("Giacomo", 400));
           persons.put("Emanuele", new CommonPerson("Emanuele", 300));
           
           for (Person person : persons.values()) {
        	   System.out.println(person);
           }
           
           for (Entry<String, Person> person : persons.entrySet()) {
        	   if(person.getValue() instanceof Villain);
        	   
        	   
           }
}
}