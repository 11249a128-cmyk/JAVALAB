/*
AIM:
To find the largest among three numbers.

ALGORITHM:
Step 1: Start the program.
Step 2: Read three numbers.
Step 3: Compare the three numbers.
Step 4: Find the largest number.
Step 5: Display the largest number.
Step 6: Stop the program.
*/

import java.util.Scanner;

public class Largestofthree {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }

        sc.close();
    }
}
/*RESULT:
Thus, the largest among three numbers is found successfully. */