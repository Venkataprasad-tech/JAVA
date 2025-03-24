package NSAA_PP3;

import java.util.Scanner;
public class Qn_88 {

	public static int ASCIISum(String s) {
		int sum = 0;
		for(int i=0;i<s.length(); i++) {
			sum += (int) s.charAt(i);
		}
		return sum;
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int asciisum = ASCIISum(s);
		System.out.println(s+" : "+asciisum);
		sc.close();
	}
}
