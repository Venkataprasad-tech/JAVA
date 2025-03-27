package NSAA___Functions;

import java.util.*;
public class Qn_53 {
	public static String isOddOrEven(int n) {
			if(n % 2 == 0) {
				return "even";
			} else {
				return "odd";
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
	    System.out.println("Output: "+isOddOrEven(n));
	    sc.close();
	}
}