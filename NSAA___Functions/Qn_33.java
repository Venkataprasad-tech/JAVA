package NSAA___Functions;

import java.util.*;
public class Qn_33 {
	public static boolean isPerfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return (s*s == x);
	}
	public static boolean isFib(int n) {
		return isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		if(isFib(n)) {
			System.out.println("True. "+n+" is a Fibonacci number.");
		} else {
			System.out.println("False. "+n+" is not a Fibonacci number.");
		}
		sc.close();
	}
}