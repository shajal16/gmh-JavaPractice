package Assignment1;
import java.util.Scanner;

/**
 * 2. Finding Factorial using while loop.
 * Example: Factorial of 5 is 120. 5*4*3*2*1 = 120
 */

public class assignment1Task2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a number to get factorial: ");
        int n = k.nextInt();
        System.out.print("Factorial of: " + n);
        k.close();
        int fact = 1;

        while (n >= 1) {
            fact = fact * n;
            n--;
        }
        System.out.println(" is " + fact);
    }
}