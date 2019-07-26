package b04;

public class S44Main {
	public static void main(String[] args) {
		S44Chicken c1 = new S44Chicken("Giustino");
		S44Chicken c2 = new S44Chicken();
		S44Chicken c3 = new S44Chicken("Amadora", 497.12);
		S44Chicken c4 = new S44Chicken("Aio", 325.12, false);
		
		System.out.println(c4);
        System.out.println(c3);
        System.out.println(c2);
        System.out.println(c1);
        
	}

}

//La classe object non ha idea di com'è fatto il mio oggetto.
//object = my class
