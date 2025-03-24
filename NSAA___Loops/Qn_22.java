package NSAA___Loops;

import java.util.*;
public class Qn_22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value n: ");
		int n = sc.nextInt();
		int i=1;
		for(; i<=n; i++) {
			System.out.print(i);
			if(i<n) {
				System.out.print(", ");
			}
		}
		sc.close();
	}
}