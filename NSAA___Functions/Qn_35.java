package NSAA___Functions;

import java.util.*;
public class Qn_35 {
	public static int findValue(int a, int b, int c) {
		return (a+b)*(a+b)*(a+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		System.out.println(findValue(a,b,c));
		sc.close();
	}
}


/*    import java.util.Scanner;

public class Qn_35 {
    public static int findValue(int a, int b, int c) {
        int a3 = (int) Math.pow(a, 3);   // a^3
        int a2b = (int) Math.pow(a, 2) * b;  // a^2b
        int two_a2b = 2 * a2b;  // 2a^2b
        int two_ab2 = 2 * a * (int) Math.pow(b, 2);  // 2ab^2
        int ab2 = a * (int) Math.pow(b, 2);  // ab^2
        int b3 = (int) Math.pow(b, 3);   // b^3
        
        return a3 + a2b + two_a2b + two_ab2 + ab2 + b3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values for a, b, c: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt(); // c is read but not used, as the equation does not require it

        System.out.println("Result: " + findValue(a, b, c));
        sc.close();
    }
}
*/