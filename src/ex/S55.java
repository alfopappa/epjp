package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		// TODO
		int result = 0;
		while (first < last) {
			result += first;
			first++;
		}
		return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		// TODO
		int result = 0;
		int value = 0;
		if (value % 2 == 0) {
			while (first < last) {
				result += first;
				first++;
			}
		}
		return result;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		int fact = 1;
		int number = 0;
		for (int i = 1; i <= number; i++) {
			fact = i * fact;
		}
		return +number;

	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		long nextNumber = 0;

		if (value == 1) {
			nextNumber = 0;
		} else if (value == 2) {
			nextNumber = 1;
		} else if (value >= 2) {

			long firstNumber = 0;
			long secondNumber = 1;
			
			for (int i = 3; i <= value; ++i) {
				nextNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = nextNumber;
			}
			return nextNumber;
		}
		return nextNumber;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
