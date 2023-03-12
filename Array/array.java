package classarray;
import java.util.*;
public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//normal input array
		System.out.println("Enter Array Size:");
		int Size = sc.nextInt();
		Double[] myList = new Double[Size];
		System.out.println("Enter "+ myList.length +" value");
		for(int i = 0; i < myList.length; i++) {
			myList[i] = sc.nextDouble();			
		}
		
		System.out.println("The numbers are : ");
		
		for(int i = 0; i < Size; i++) {
			System.out.println(myList[i]);
		}
		
		//random array
		System.out.println("Enter Array Size For random:");
		int Size2 = sc.nextInt();
		Double[] myList2 = new Double[Size2];
		for(int i = 0; i < myList2.length; i++) {
			myList2[i]= Math.random()*100;
			
		}
		System.out.println("The "+ myList2.length +" random values are: ");
		for(int i = 0; i < Size2; i++) {
			System.out.println(myList2[i]);
		}
		
		//sum of the input array
		double total=0;
		for(int i=0; i<myList.length;i++){
			total+=myList[i];
		}
		System.out.println("The sum of inputs value is : "+total);
		
		//sum of the random array
		double total2=0;
	    for(int i=0; i<myList2.length;i++){
	    total2+=myList2[i];
		}
		System.out.println("The sum of random values is : "+total2);
		
		//finding the largest element of input value 
		double max = myList[0];
		for(int i =1; i<myList.length;i++) {
			if(myList[i]>max) {
				max = myList[i];
			}}
			System.out.println("The largest of input values is : "+max);
		
		//finding the largest element of random value 
		double max2 = myList2[0];
		for(int i =1; i<myList2.length;i++) {
			if(myList[i]>max) {
				max = myList2[i];
		    }}
			System.out.println("The largest of input values is : "+max2);
			
		//finding the smallest element of input value 
		double min = myList[0];
		for(int x =1; x<myList.length;x++) {
			if(myList[x]< min) {
			   min = myList[x];
			}}
			System.out.println("The smallest of input values is : "+min);
				
		//finding the smallest element of random value 
		double min2 = myList2[0];
		for(int x =1; x<myList2.length;x++) {
			if(myList2[x]< min) {
			    min2 = myList2[x];
			}}
			System.out.println("The smallest of input values is : "+min2);
						
		
		}
		}


