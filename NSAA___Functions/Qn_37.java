package NSAA___Functions;

import java.util.*;
public class Qn_37 {
	public static int countNumberOfDigits(int n) {
		int count=0;
		while(n!=0) {
			n = n/10;
			++count;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n=sc.nextInt();
		System.out.println(countNumberOfDigits(n));
		sc.close();
	}
}