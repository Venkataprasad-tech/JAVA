package NSAA___Functions;

import java.util.*;
public class Qn_42 {
	public static boolean primeDigitSum(int input) {
		if(input < 2)
			return false;
		for(int i=2; i<= Math.sqrt(input); i++) {
			if(input % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while( n!=0) {
			int input = n%10;
			if(primeDigitSum(input)) {
				sum += input;
			}
			 n=n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
