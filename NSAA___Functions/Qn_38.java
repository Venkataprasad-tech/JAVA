package NSAA___Functions;

import java.util.*;
public class Qn_38 {
	public static int sumOfDigits(int input) {
		int sum=0;
		while(input>0) {
			sum = sum+input %10;;
			input = input/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n=sc.nextInt();
		System.out.println(sumOfDigits(n));
		sc.close();
	}
}