package b06.s070;

public class Intern extends Person {
	protected static final double DEFAULT_REFUND = 0.0;
	  
	private double refund;
		
		public Intern() {
			  
	    }
		
		public Intern(String name, double refund) {
			this(name, DEFAULT_SURNAME, refund);
		}
		
		public Intern(String name, String surname, double refund) {
			  super (name, surname);
			  this.refund = refund;
		}
		  
		public double getRefund() {
			return refund;
			
		}
		

		@Override
		public String toString() {
			return "Intern [refund=" + refund + "]";
		}
		
}
