package b06.s070;

public class Employee extends Person {

protected static final double DEFAULT_SALARY = 0.0;
	  
private double salary;
	
	public Employee() {
		  
    }
	public Employee(String name, double salary) {
		this(name, DEFAULT_SURNAME, salary);
	}
	public Employee(String name, String surname, double salary) {
		  super (name);
		  this.salary = salary;
		 
	}
	  
	public double getSalary() {
		return salary;
	
		
	}
	

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	
}
