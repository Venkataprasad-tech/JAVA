package NSAA___Functions;

import java.util.*;
public class Qn_45 {
	public static int fact(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static boolean isStrong(int n) {
		int sum=0;
		int OriginalNumber = n;
		while(n>0) {
			int digit = n % 10;
			sum += fact(digit);
			n /= 10;
		}
		return sum == OriginalNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		if(isStrong(n)) {
			System.out.println(n+" is a strong number.");
		} else {
			System.out.println(n+" is not a strong number.");
		}
		sc.close();
	}
}