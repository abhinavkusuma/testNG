package sele.testng_test;

public class Reverse_String {
	
	public static void main(String[] args) {
		String a = "Automation";
		String reverse = new StringBuilder(a).reverse().toString();
		System.out.println(reverse);
	}
}
