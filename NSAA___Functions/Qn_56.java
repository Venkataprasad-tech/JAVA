package NSAA___Functions;

import java.util.*;
public class Qn_56 {
	public static float volumeOfCube(int a) {
		if(a<0)
			return -1;
		else
			return (a*a*a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: a = ");
		int n = sc.nextInt();
		System.out.println("Output: "+volumeOfCube(n));
		sc.close();
	}
}