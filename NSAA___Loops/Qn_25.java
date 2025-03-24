package NSAA___Loops;

import java.util.*;
public class Qn_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Assume that n = ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.print("Sum of first 5 natural numbers = ");
		for(int i=1; i<=n; i++) {
			sum +=i;
			System.out.print(i);
			if(i<n) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = "+sum);
		sc.close();
	}
}