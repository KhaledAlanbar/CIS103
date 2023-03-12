package labaarray;
import java.util.*;
public class labarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Students Number: ");
		int Size = sc.nextInt();
		Integer[] myList = new Integer[Size];
		Integer flip[] = new Integer[Size];
		System.out.println("Enter "+ myList.length +" value");
		for(int i = 0; i < myList.length; i++) {
			myList[i] = sc.nextInt();
		}
		int x=0;
		int i = 0;
		System.out.println("The Average Marks is : ");
		for(i = 0; i < Size; i++) {
		      x += myList[i];
		      
		}
		int sum = x/Size;
		  System.out.println(sum);
		
		  for(i = 0; i < Size; i++) {
			if(myList[i]>sum) {
	    		System.out.println("This Mark is above average: "+ myList[i]);
	    	}
			}
			System.out.println("The flip is: ");
			int z = Size-1;
	    for(int y = 0 ; y < Size ; y++) {
	        	flip[y]=myList[z];
	        	z--;
				}
	    for(int y = 0 ; y < Size ; y++) {
	        System.out.println(flip[y]);
			}

        
		}
		
	   
		
	
}
