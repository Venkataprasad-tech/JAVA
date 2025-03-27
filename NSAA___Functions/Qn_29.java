package NSAA___Functions;

import java.util.*;
public class Qn_29 {
	public static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		printTable(n);
		sc.close();
	}
}