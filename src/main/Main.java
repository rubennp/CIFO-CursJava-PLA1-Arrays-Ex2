package main;

import java.util.Scanner;

public class Main {

	/*
	 * Pide 10 números entre el 1 y el 10.
	 * Los guarda en un Array.
	 * Los muestra ordenados de mayor a menor.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		System.out.println("Introduce 10 números entre el 1 y el 10 y yo los ordenaré de mayor a menor");
		System.out.println("--------------------------------------------------------------------------");
		
		for (int n = 0; n < 10; n++) {
			do {
				System.out.println("* Número " + (n+1) + ": ");
				nums[n] = in.nextInt();
				if (nums[n] < 1 || nums[n] > 10) System.out.println("¡Tienen que ser entre el 1 y el 10!");
			} while (nums[n] < 1 || nums[n] > 10);
		}
		
		System.out.print("-> ");
		for (int i : ordena(nums)) {
			System.out.print(i + " ");
		}
		
		in.close();
	}
	
	/*
	 * ordena(int[]) -> int[]
	 * 
	 * Ordena de mayor a menor un Array de números enteros
	 */
	static int[] ordena(int[] nums) {
		
		for (int i1 = 0; i1 < nums.length; i1++) {				// recorre todo el Array desde el principio
			if (i1 != nums.length-1) {							// si no es el último elemento...
				for (int i2 = i1+1; i2 < nums.length; i2++) {	// ...recorre los siguientes elementos del Array para comparar
					if (nums[i2] > nums[i1]) {					// si i2 es mayor que i1 intercanvia posiciones
						int mem = nums[i1];
						nums[i1] = nums[i2];
						nums[i2] = mem;
					}
				}
			}
		}
		
		return nums;
	}
}
