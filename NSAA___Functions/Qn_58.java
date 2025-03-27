package NSAA___Functions;

import java.util.*;
public class Qn_58 {
	public static float areaOfCircle(float radius) {
		float PI = (float) 3.14;
		if(radius<0)
			return -1;
		else
			return (PI*radius*radius);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: r = ");
		float r = sc.nextFloat();
		System.out.print("Output: "+areaOfCircle(r));
		sc.close();
	}
}