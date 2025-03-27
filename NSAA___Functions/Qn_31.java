package NSAA___Functions;

import java.util.*;
public class Qn_31 {
	public static void printCubeTable(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println("Cube ("+i+") = "+(i*i*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		printCubeTable(n);
		sc.close();
	}
}