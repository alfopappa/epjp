package b07;

public class S75 {
    public void f() {
        try {
            g();
        } catch (Exception ex) {
            System.out.println("Exception caught");
        } finally {
            cleanup();
          
            
        }
    }
    
    class PappaException extends Exception {
    	
		private static final long serialVersionUID = 1L;

		public PappaException(String message) {
    		super (message);
    	}
    }
    
    
    
    
int first(int[] values) throws PappaException {
	if(values == null || values.length == 0) {

		throw new PappaException("Non ho niente da dire!");
		
	}
	return values[0];
}
    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
        
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        S75 exceptional = new S75();
        exceptional.f();
       
        try {
			exceptional.first(null);
		} catch (PappaException e) {
			
			e.printStackTrace();
		}
    }
}
