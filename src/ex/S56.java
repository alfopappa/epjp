package ex;

public class S56 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
    	StringBuilder sb = new StringBuilder(s);
		sb.reverse();
    	return sb.toString();
    }
    

    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
    	
        if (s.length() == 0 || s.length() == 1)
            return true; 
        if (s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }
           

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
    	return s.replaceAll("[aeiouAEIOU]", "");    	
        
    }

    /**
     * Convert from binary to decimal
     * 
     * @param s a string that contains the binary representation of an integer
     * @return the converted integer
     */
    public static int bin2dec(String s) {
    	   double j = 0;
    	    for(int i = 0; i < s.length(); i++){
    	        if (s.charAt(i) == '1') {
    	         j = j + Math.pow(2, s.length() - 1 - i);
    	     }

    	    }
    	    return (int) j;
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[data.length - 1 - i];
        }
	     return result;
    }

    /**
     * Calculate the average
     * 
     * @param data
     * @return the average
     */
    public static double average(int[] data) {
    	 int result = 0;
    	 
    	 for(int i = 0; i < data.length; i = i+1) {
    	      result = result + data[i];
    	    }

    	    result = result / data.length;

    	    return result;
    	    
   }

    
    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
    	int max = data[0];
    	  for(int i = 1; i < data.length; i++) {
    	    if(data[i] > max) {
    		  max = data[i];
    		}
    	  }
    	  return max;
      
    }
}
