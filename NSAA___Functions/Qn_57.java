package NSAA___Functions;

import java.util.*;
public class Qn_57 {
	public static float areaOfRectangle(float length, float breadth) {
		if(length<0 || breadth<0)
			return -1;
		else
			return (length*breadth);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("l: ");
		float l = sc.nextInt();
		System.out.print("b: ");
		float b = sc.nextInt();
		System.out.println("Output: "+areaOfRectangle(l, b));
		sc.close();
	}
}