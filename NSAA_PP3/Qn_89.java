package NSAA_PP3;

import java.util.*;
public class Qn_89 {
	
	public static void ToUpperCase(char name[]) {
		for(int i=0; i<name.length; i++) {
			name[i] = Character.toUpperCase(name[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.nextLine();		
		char name[] = s.toCharArray();
		System.out.println("Before conversion: ");
		for(char c : name) {                       // for(int i=0; i<name.length; i++) { System.out.println(name[i]+" ");}
			System.out.print(c+" ");
		}
		System.out.println();
		ToUpperCase(name);
		System.out.println("After conversion: ");
		for(char c : name) {                       // for(int i=0; i<name.length; i++) { System.out.println(name[i]+" ");}
			System.out.print(c+" ");
		}
	}
}