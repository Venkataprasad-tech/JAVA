package NSAA___Functions;

import java.util.*;
public class Qn_27 {
	public static void oddSeries(int n) {
		for(int i=0;i<n;i++) {
				System.out.println((2*i+1)+" ");
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		oddSeries(n);
		sc.close();
	}
}