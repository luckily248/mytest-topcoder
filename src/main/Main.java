package main;

public class Main {

	public static void main(String[] args) {
//		AB ab=new AB();
//		String result=ab.createString(7, 12);
//		System.out.print(result);
		ABBA abba=new ABBA();
		String result=abba.canObtain("AB", "ABAAB");
		System.out.print(result);
	}

}
