package NSAA___Functions;

import java.util.*;
public class Qn_30 {
	public static void printSquareTable(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println("Square "+"("+i+") = "+(i*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		printSquareTable(n);
		sc.close();
	}
}