package classarray;

import java.util.*;

public class array2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size:");
		int Size = sc.nextInt();
		Integer[] array_1 = new Integer[Size];
		Integer[] array_2 = new Integer[Size];
		Integer[] array_3 = new Integer[Size];
		System.out.println("Enter values "+ array_1.length +" for array 1: ");
		for(int i = 0; i < array_1.length; i++) {
			array_1[i] = sc.nextInt();			
		}
		System.out.println("Enter values "+ array_2.length +" for array 2: ");
		for(int i = 0; i < array_2.length; i++) {
			array_2[i] = sc.nextInt();			
		}
		int[] z = new int[Size];
		for(int i = 0; i < array_3.length; i++) {
			System.out.println(array_3[i] = array_1[i]+array_2[i]);			
		}
	
		
	}

}
