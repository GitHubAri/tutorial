/*
 * Power using For Loop and Function 
 * Additional Logic: Error Handling, Best datatype selection
 * Dev: Aritra Ghosh
 */

import java.util.Scanner;

public class powerCode2 {
    // function to find the power of a number
    public static double power(double base, int exponent) { // Returning Double
        // Checking Possible Errors
        if (base == 0)
            return 0;
        if (exponent == 0)
            return 1;

        double result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        double base;
        int exponent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = sc.nextInt();
        sc.close();

        // calling function
        double pow = power(base, exponent);
        // prints the result
        System.out.println(base + " to the power " + exponent + " is: " + pow);
    }
}
