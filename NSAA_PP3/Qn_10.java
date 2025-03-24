package NSAA_PP3;

import java.util.Scanner;
public class Qn_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		int sum = a + b;
		if(sum % 2 == 0) {
			System.out.println("\nSum is even");
		} else {
			System.out.println("\nSum is odd");
		}
		sc.close();
	}

}
