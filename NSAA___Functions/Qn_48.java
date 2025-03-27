package NSAA___Functions;

import java.util.*;
public class Qn_48 {
	public static int ConvertBase17toDecimal(String s){
		int decimalvalue = 0;
		int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            int digitValue;

            // Convert character to numeric value
            if (Character.isDigit(ch)) {
                digitValue = ch - '0';  // Convert '0'-'9' to integer (0-9)
            } else {
                digitValue = ch - 'A' + 10; // Convert 'A'-'G' to integer (10-16)
            }

            // Compute positional value and add to total
            decimalvalue += digitValue * Math.pow(17, length - 1 - i);
        }
        return decimalvalue;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String s = sc.next().toUpperCase();
		System.out.print("Output: "+ConvertBase17toDecimal(s));
		sc.close();
	}
}