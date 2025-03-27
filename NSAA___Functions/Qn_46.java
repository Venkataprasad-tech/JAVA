package NSAA___Functions;

import java.util.*;
public class Qn_46 {
	public static int Cube(int n) {
		return n*n*n;
	}
	public static boolean isAmstrong(int n) {
		int sum=0;
		int OriginalNumber = n;
		while(n>0) {
			int digit = n % 10;
			sum += Cube(digit);
			n /= 10;
		}
		return sum == OriginalNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		if(isAmstrong(n)) {
			System.out.println(n+" is a Armstrong number.");
		} else {
			System.out.println(n+" is not a Armstrong number.");
		}
		sc.close();
	}
}