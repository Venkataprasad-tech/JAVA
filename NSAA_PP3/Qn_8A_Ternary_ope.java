package NSAA_PP3;

import java.util.*;
public class Qn_8A_Ternary_ope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		int max;
		max = (a>b)? (a>c ? a:c) : (b>c ? b:c);
		System.out.println("highest number is: "+max);
		sc.close();
	}
}
