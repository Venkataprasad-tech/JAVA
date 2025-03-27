package NSAA___Functions;

import java.util.*;
public class Qn_39 {
	public static int sumUptoSingleDigit(int input) {
		while(input>=10) {
			int sum=0;
			while(input>0) {
				sum +=input%10;
				input /= 10;
			}
			input = sum;
		}
		return input;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		System.out.println(sumUptoSingleDigit(n));
		sc.close();
	}
}