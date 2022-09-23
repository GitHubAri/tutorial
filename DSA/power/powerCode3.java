/*
 * Power using Recursive Method
 * Math Eque: x^n = x^n/2 * x^n/2 * x^n%2
 * Dev: Aritra Ghosh
 */

import java.util.Scanner;

public class powerCode3 {
    // Recursive Method to find the power of a number
    public static double power(double base, int exponent) {
        if (exponent == 0)  // Err hndl
            return 1;
        if (exponent == 1)
            return base; // Terminal Point
        
        int half = exponent / 2;
        int remainder = exponent % 2;

        if (exponent % 2 == 1 && base < 0 && exponent < 0)
            return -1 / (power(-base, half) * power(-base, half) * power(-base, remainder));
        else if (exponent < 0)
            return 1 / (power(base, -half) * power(base, -half) * power(base, -remainder));
        else
            return (power(base, half) * power(base, half) * power(base, remainder)); 
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
