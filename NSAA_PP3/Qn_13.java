package NSAA_PP3;

import java.util.*;
public class Qn_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print(" Leap year");
			} else {
				System.out.print("Not Leap year");
			}
		sc.close();
	}
}