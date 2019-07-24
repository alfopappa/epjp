package b04;

public class MyS45 {
	public static void main(String[] args) {
		String x = "Pappalardo"; 
		String y = "Alfonso";
		String z = "lardo";

		
        System.out.println("char at position 1 in x: " + x.charAt(1));
        
        System.out.println("y>x:" + y.compareTo(x));
        System.out.println("x>y:" + x.compareTo(y));
        
        System.out.println("concat y and x:" + y.concat(x));
        
        System.out.println("x contains z?:" + x.contains(z));
        
        System.out.println(x.equals(z));
        System.out.println(y.equals(z));
        System.out.println(x.equals(y));
        
		System.out.println(z.indexOf("r")); 
        System.out.println(x.indexOf(z));
        System.out.println(z.lastIndexOf("d"));

        System.out.println("".isEmpty());
        
        System.out.println(x.length());
        
		String y2 = y.replace("o","a");
		System.out.println(y2);
		
		System.out.println("upper: " + z.toUpperCase());
		System.out.println("lower: " + z.toLowerCase());
		
        System.out.println("figa[" + " Ahi Ahi Ahi ".trim() + "]");
        
        

		
		
        
        
        
        
        
        
        
        
        
        
        
        

		
	}
}

