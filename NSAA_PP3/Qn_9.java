package NSAA_PP3;

import java.util.*;
public class Qn_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		System.out.print("Enter the third number: ");
		int c = sc.nextInt();
		System.out.print("Enter the fourth number: ");
		int d = sc.nextInt();
		
		int highest = a;
		int lowest = a;
		
		if(b>highest) {
			highest = b;
		}
		if(c>highest) {
			highest = c;
		}
		if(d>highest) {
			highest = d;
		}
		
		
		if(b<lowest) {
			lowest = b;
		}
		if(c<lowest) {
			lowest = c;
		}
		if(d<lowest) {
			lowest = d;
		}
		
		System.out.println("highest number is: "+highest);
		System.out.println("lowest number is: "+lowest);
		sc.close();
	}
}
