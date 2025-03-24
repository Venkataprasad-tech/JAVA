package NSAA_PP3;

import java.util.Scanner;
public class Qn_5 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        int a = sc.nextInt();
		        System.out.print("Enter the second number: ");
		        int b = sc.nextInt();
		        if (a > b) {
		            System.out.println("The greatest number is: " + a);
		        } else if (a < b) {
		            System.out.println("The greatest number is: " + b);
		        } else {
		            System.out.println("Both numbers are equal.");
		        }
		        sc.close(); // Closing the scanner
	}
}
