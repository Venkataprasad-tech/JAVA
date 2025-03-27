package NSAA___Functions;

import java.util.*;
public class Qn_43 {
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		 for (int i = 2; i * i <= n; i++) { // Use i * i <= n instead of sqrt(n) for better efficiency
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" is a prime number.");
		} else {
			System.out.println(n+" is not a prime number.");
		}
		sc.close();
	}
}