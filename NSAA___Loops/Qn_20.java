package NSAA___Loops;

import java.util.*;
public class Qn_20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		int c =0;
		for(int i=0; i<20; i++) {
			System.out.println(s);
			c++;
		}
		System.out.println("Count = "+c);
		sc.close();
	}
}