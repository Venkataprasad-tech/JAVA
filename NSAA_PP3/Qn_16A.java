package NSAA_PP3;

import java.util.Scanner;

public class Qn_16A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = s.nextInt();
		System.out.print("Enter b: ");
		int b = s.nextInt();
		int choice = s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition: "+(a+b));
		case 2:
			System.out.println("Subtraction: "+(a-b));
		case 3:
			System.out.println("Multiplication: "+(a*b));
		case 4:
			System.out.println("Division: "+(a/b));
		case 5:
			System.out.println("Modulus: "+(a%b));
		default:
			System.out.println("Default case executed.");
		}
		s.close();
	}

}
