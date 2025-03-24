package NSAA_PP3;

import java.util.Scanner;
public class Qn_16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = s.nextInt();
		System.out.print("Enter b: ");
		int b = s.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modulus: "+(a%b));
		s.close();
	}

}
