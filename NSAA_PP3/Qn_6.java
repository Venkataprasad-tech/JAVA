package NSAA_PP3;

import java.util.*;
public class Qn_6 {
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter first number: ");
		    int a = sc.nextInt();
		    System.out.print("Enter second number: ");
		    int b = sc.nextInt();
			System.out.println(a +" < "+ b + (a < b));
			System.out.println(a +" <= "+ b + (a <= b));
			System.out.println(a +" > "+ b + (a > b));
			System.out.println(a +" >= "+ b + (a >= b));
			System.out.println(a +" == "+ b + (a == b));
			System.out.println(a +" != "+ b + (a != b));
			sc.close();
	}

}
