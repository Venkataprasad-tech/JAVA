package NSAA_PP3;

import java.util.Scanner; 
public class Qn_87 {

	public static void printASCII(int data[]) {
		for(int i=0; i<data.length; i++) {
			System.out.println((char) data[i]+" \t\t "+data[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("-----------------------------------");
		System.out.println("char"+" \t\t "+"ASCII Value");
		System.out.println("------------------------------------");
		int name[] = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			name[i] = (int) s.charAt(i);
		}
		printASCII(name);
		System.out.println("------------------------------------");
		sc.close();
	}
}
