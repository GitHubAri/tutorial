/*
 * Power using Recursive Method
 * Math Eque: x^n = x^n/2 * x^n/2 * x^n%2
 * Dev: Aritra Ghosh
 */

import java.util.Scanner;

public class powerCode4 {
    // Recursive Method to find the power of a number
    public static double power(double base, int exponent) {
        if (exponent == 0)
            return 1;

        double v = power(base, exponent / 2);

        if (exponent % 2 == 0) {
            return v * v;
        } else {
            return v * v * base;
        }
    }

    public static double pow(double x, int n) {
        if (n < 0) {
            return 1 / power(x, -n);
        } else {
            return power(x, n);
        }
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
        double pow = pow(base, exponent);
        // prints the result
        System.out.println(base + " to the power " + exponent + " is: " + pow);
    }
}
