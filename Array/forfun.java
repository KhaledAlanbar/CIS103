package forfun;

public class forfun {
	public static void main (String[] args) {
		String str1 = "String method tutorial";
		String str2 = "compareTo method example";
		String str3 = "String method tutorial";
		
		int var1 = str1.compareTo( str2 );
		System.out.println("str1 & str2 comparison: "+var1);
		
		int var2 = str1.compareTo( str3 );
		System.out.println("str1 & str3 comparison: "+var2);
		
		int var3 = str2.compareTo( "compareTo method example" );
		System.out.println("str2 & string argument comparison: "+var3);
		
		str1 = str1.concat(" are ");
		str1 = str1.concat("Clear");
		System.out.println(str1);
		
		String str4 = new String("quick brown fox jumps over the lazy dog");
		System.out.println("Substring starting from index 15:");
		System.out.println(str4.substring(15));
		System.out.println("Substring starting from index 15 and ending at 20:");
		System.out.println(str4.substring(15, 20));
		
		System.out.println("Index of B in str4: "+str4.indexOf('r'));
		System.out.println("Index of B in str4 after 15th char: "+str4.indexOf('r', 10));
		
		System.out.println("Last 'r' in str4: "+str4.lastIndexOf('r'));
	}
	
}

