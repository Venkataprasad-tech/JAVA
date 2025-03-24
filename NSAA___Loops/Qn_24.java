package NSAA___Loops;

import java.util.*;
public class Qn_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Assume that N = ");
		int N = sc.nextInt();
		int i = 1;
		System.out.print("The square of first 5 natural numbers are: ");
		while(i<=N) {
			System.out.print(i*i);
			if(i<N) {
				System.out.print(", ");
			}
			i++;
		}
		System.out.println();
		
		i=1;
		System.out.print("The cube of first 5 natural numbers are: ");
		while(i<=N) {
			System.out.print(i*i*i);
			if(i<N) {
				System.out.print(", ");
			}
			i++;
		}
		System.out.println();
		sc.close();
	}
}