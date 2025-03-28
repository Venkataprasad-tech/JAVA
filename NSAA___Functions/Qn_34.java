package NSAA___Functions;

import java.util.*;
public class Qn_34 {
	public static int NthFib(int n) {
		if(n<=1) {
			return n;
		}
		int a=1, b=1;
		for(int i=3; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.println(n+"th Fibonacci number = "+NthFib(n));
		sc.close();
	}
}