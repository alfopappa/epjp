package ex;

public class S54 {
    /**
     * Check if the parameter is positive, negative, or zero
     *  
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
        // TODO
    	 if (value < 0) {
    		 return "negative";
    	 }
    		 else if (value == 0) {
    			 return "zero";
    		 }
    		 else {
    		     return "positive";
    			 }
    		 }
    			 

    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return "odd" or "even"
     */
    public static boolean isOdd(int value) {
        // TODO
    	if (value % 2 == 1) {
        return true; 
    	}
    	else {
    		return false;
    	}
    }
    
    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        // TODO
    	switch (value) {
        case 0:
            return "zero";
        case 1:
            return "one";
        case 2:
            return "two";
        case 3: 
        	return "three";
        case 4:
        	return "four";
        case 5:
            return "five";
        case 6:
            return "six";
        case 7:
            return "seven";
        case 8: 
        	return "eight";
        case 9:
        	return "nine";
        default: 
        	return "other";
    	}
    }
    
    /**
     * Convert a value in the interval [0, 100] to a letter in [A, F]
     * 
     * A if value > 90
     * B if value in (80, 90]
     * ...
     * F if value <= 50
     * 
     * @param percentile in [0, 100]
     * @return a letter in [A, F]
     */
    public static char vote(double percentile) {
        // TODO
    	char result = 'F';
    	   if (percentile >= 90) { result = 'A'; }
    	   if (percentile >= 80) { result = 'B'; }
    	   if (percentile >= 70) { result = 'C'; }
    	   if (percentile >= 60) { result = 'D'; }
    	return result;
    
    }
    
    /**
     * Leap year checker
     * 
     * @param year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
        // TODO
        boolean leap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
		return leap;
    }
        
    
    /**
     * Sort the input parameters
     * 
     * @param a
     * @param b
     * @param c
     * @return a sorted array
     */
    public static int[] sort(int a, int b, int c) {
    	
        int[] result = new int[3];
        
        // TODO
        result[2] = Math.max(Math.max(a, b),c);
        result[0] = Math.max(Math.min(a, b),c);
        result[1] = a + b + c - result[2] - result[0];
        return result;
       
    }
}
