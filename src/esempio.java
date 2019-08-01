
public class esempio {

public static void main(String[] args) {
    int k = 5;
    int[] values = {7, 5, 11};
    
    for(int value : values) {
    	value += k;
    	
    }
   

    for (int value : values) {
        System.out.println(value + " ");
    }
    System.out.println();
    
    for (int i = 0; i < values.length; i++) {
    	System.out.println(values[i] + " ");
    }
    }
}