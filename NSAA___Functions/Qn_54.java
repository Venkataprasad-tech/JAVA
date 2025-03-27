package NSAA___Functions;

import java.util.*;
public class Qn_54 {
	public static boolean isMulOfX(int n, int x) {
		if(x == 0) {
			return false;
		}
		if(n % x == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value n: ");
		int n = sc.nextInt();
		System.out.print("Enter value x: ");
		int x = sc.nextInt();
		System.out.println(isMulOfX(n,x));
		sc.close();
	}
}