package NSAA___Functions;

import java.util.*;
public class Qn_59 {
	public static float findSI(float p, float n, float r) {
		if(p<0 || n<0 || r<0)
			return -1;
		float SI = (p*n*r)/100;
		return SI;
	}
	public static float findCI(float P, float N, float R) {
		if(P<0 || N<0 || R<0)
			return -1;
		float CI = (float)(P * Math.pow((1 + R / 100), N) - P);
		return CI;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("p = ");
		float p = sc.nextFloat();
		System.out.print("n = ");
		float n = sc.nextFloat();
		System.out.print("r = ");
		float r = sc.nextFloat();
		
		float si = findSI(p,n,r);
		float ci = findCI(p,n,r);
		System.out.println("Simple Interest (SI) = "+si);
		System.out.println("Compound Interest (CI) = "+ci);
		sc.close();
	}
}