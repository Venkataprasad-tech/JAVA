package NSAA___Functions;

import java.util.*;
public class Qn_28 {
	public static void evenSeries(int n) {
		for(int i=1; i<=n; i++) {
				System.out.println(2*i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		evenSeries(n);
		sc.close();
	}
}