package NSAA___Functions;

import java.util.*;
public class Qn_47 {
	public static int[] range(int start, int end, int step) {
		if(step<0) {
			System.out.println("Step must be greater than zero");
		}
		
		int size = (end - start+step - 1)/step;
		int a[] = new int[size];
		int index = 0;
		for(int i=start; i<end; i+=step) {
			a[index++] = i;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("start= ");
		int start= sc.nextInt();
		System.out.print("end= ");
		int end= sc.nextInt();
		System.out.print("step= ");
		int step= sc.nextInt();
		int a[]=range(start,end,step);
		System.out.println("answer= "+Arrays.toString(a));
		sc.close();
	}
}