package b06.s070;

public class Main {
	public static void main(String[] args) {
		Person[] persons = new Person[4];
		
		
		persons[0] = new Employee("Alfonso", "Pappalardo", 1800);
		persons[1] = new Employee("Maurizio", "Pilato", 2200);
		persons[2] = new Intern("Michele", "Pizzuti", 600);
		persons[3] = new Intern("Mario", "Rossi", 800);
		
		for (Person person : persons) {
		System.out.println(person.toString());
	}
}
}
