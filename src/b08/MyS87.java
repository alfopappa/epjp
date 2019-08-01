package b08;

import java.util.Scanner;

public class MyS87 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Please, enter some int numbers");

		while (scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Enter at least one int number");
		}
		int n;
		int cont = 1;
		int sum = 0;
		double average = 0;

		while (scanner.hasNextInt()) {
			n = scanner.nextInt();
			cont++;
			sum = sum + n;
		}

		average = sum / cont;
//		int result = 0;
//   	 
//   	 for(int i = 0; i < scanner.length; i = i+1) {
//   	      result = result + scanner[i];
//   	    
//
//   	    result = result / scanner.length;

		System.out.println("The average value is: " + average);
	}

}
DA CORREGGERE 
