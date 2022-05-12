package Assignment1;
import java.util.Scanner;

/**
 * 1. Program to find sum of first n (entered by user) natural numbers.
 * Example:
 * Enter the value of n:
 */

public class assignment1Task1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = k.nextInt();
        k.close();
        int sum = 0;

        for (int c = 1; c <= n; c++) {
            sum += c;

        }
        System.out.println("Sum = " + sum);
    }
}