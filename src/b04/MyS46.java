package b04;

public class MyS46 {
	
public static void main(String[] args) {
	
	StringBuilder alfonso = new StringBuilder("Computer science");
	
	System.out.println(alfonso.append(' ').append("is").append(' ').append("dangerous"));
	
	System.out.println(alfonso.charAt(6));
	
	System.out.println(alfonso.deleteCharAt(5).delete(1, 2));
	
	System.out.println(alfonso.indexOf("atic"));
	
	System.out.println(alfonso.insert(1, "n").insert(5, "m"));
	
	System.out.println(alfonso.length());
	
	System.out.println(alfonso.indexOf("a"));
	
	System.out.println(alfonso.replace(11, 22, "p p"));
	
	System.out.println(alfonso.reverse());
    
    alfonso.setCharAt(20, 'c');
    System.out.println(alfonso);
   
    alfonso.setLength(7);
    System.out.println(alfonso);
}
	
}


