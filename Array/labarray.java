package arraylab22;

import java.util.*;

public class labarray {
	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] = "First name ";
		name[1] = "Second name ";
		name[2] = "Third name ";
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter 5 Integer");
		for(int i = 0; i < 5 ;i++) {
			num[i]=sc.nextInt();
		}
		int sum =0;
		for(int i = 0; i < 5 ;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
		for(int i = 0; i < 3 ;i++) {
			System.out.print(name[i]);
		}
		int j = 3-1;
		String[] flip = new String[3];
		for(int i = 0; i < name.length ;i++) {
			flip[i]=name[j];
			j--;
		}
		for(int i = 0; i < 3 ;i++) {
			System.out.print(" "+flip[i]);
		}
	}

}
