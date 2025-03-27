package NSAA___Functions;

import java.util.*;
public class Qn_32 {
	public static int fib(int n) {
			if(n <= 1) {
				return 1;
			} else {
				return fib(n - 1) + fib(n - 2);
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " "); // Call recursive function
        }
        sc.close();
		}
}

/* Approach 2: Iterative Fibonacci (More Efficient)
import java.util.Scanner;

public class Nth_Fib {
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		int a =0, b=1;
		for(int i=2; i<=n; i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(fib(n));
	}

}
*/