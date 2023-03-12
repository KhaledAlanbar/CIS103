package classarray;
import java.util.*;
public class array3 {
	public static void main(String[] args) {
		int Size = 20;
		int[] array = new int[Size];
		for(int i =0; i<array.length;i++) {
			array[i]=(int) Math.floor(Math.random()*100);
		}
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		printnum(array);
		check(array);
	}
	public static int printnum(int[] array) {
		Scanner sc = new Scanner(System.in);
		int x ;
		System.out.println("Enter the number you want to print:");
		x = sc.nextInt();
			System.out.println("The number is: "+array[x]);
		return x;
		
	}
	public static int check(int[] array) {
		Scanner sc = new Scanner(System.in);
		int x ;
		System.out.println("Enter the number you looking for:");
		x = sc.nextInt();
		for(int i =0; i<array.length;i++) {
			if(x==array[i]) {
				System.out.println(array[i]);
				return x;
			}
		}
		return x-1;
		
	}

}
