package NSAA___Functions;

import java.util.*;
public class Qn_55 {
	public static float areaOfSquare(int a) {
		if(a<0) {
			return -1;
		} else 
			return (a*a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: a = ");
		int n = sc.nextInt();
		System.out.print("Output: "+areaOfSquare(n));
		sc.close();
	}
}