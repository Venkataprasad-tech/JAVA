package NSAA___Functions;

import java.util.*;
public class Qn_44 {
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int PrimeCount(int start, int end) {
		int count =0;
		for(int i=start; i<=end; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("start: ");
		int strat = sc.nextInt();
		System.out.print("end: ");
		int end = sc.nextInt();
		sc.close();
		
		int primecount = PrimeCount(strat, end);
		System.out.println("Total Count of Primes: "+primecount);
	}
}