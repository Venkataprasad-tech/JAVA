package NSAA_PP3;

import java.util.Scanner;
public class Qn_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a % 100 == 0) {
			System.out.println(a +" multiple of 100");
		} else {
			System.out.println(a +" not multiple of 100");
		}
		sc.close();
	}

}
