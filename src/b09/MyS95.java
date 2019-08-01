package b09;



public class MyS95 {
	//public static ArrayList<Integer>merge(Integer[] a1, Integer[] a2) {
	public static int[] unisciDueArrayOrdinati (int[] a1, int[]a2) { 
		int[] arrayRisultante = new int[a1.length+a2.length]; 
		int ia1 = 0;
		int ia2 = 0;
		int iR = 0;
		
		while (ia1 < a1.length && ia2 < a2.length) {
			if (a1[ia1] < a2[ia2]){ 
				arrayRisultante[iR] = a1[ia1];
				ia1++; }
			else arrayRisultante[iR] =a2[ia2];
			    ia2++;
			    iR++;
		}
		while (ia1 < a1.length) {
			arrayRisultante[iR] = arrayRisultante[ia1];
			ia1++;
			iR++;
			}
		while (ia2 < a2.length) { 
			arrayRisultante[iR] = a2[ia2];
			ia2++;
			iR++;
			}
		return arrayRisultante;
		}
	public static void visualizzaArray (int[] V) {
		for (int i = 0; i < V.length; i++) 
			System.out.print(V[i] + " ");
		System.out.println(); 
		}
	public static void main(String[] args) {
		visualizzaArray ( unisciDueArrayOrdinati ( new int[] {3, 7, 12,}, new int[] { 1, 5, 6 } ) );
		}
	
	}

	
	
	
	