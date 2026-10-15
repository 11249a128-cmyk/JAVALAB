/*
AIM:
To write a Java program to reverse a given number.

ALGORITHM:
Step 1: Start the program.
Step 2: Read an integer from the user.
Step 3: Initialize reverse = 0.
Step 4: Get the last digit using n % 10.
Step 5: Multiply reverse by 10 and add the last digit.
Step 6: Remove the last digit using n = n / 10.
Step 7: Repeat Steps 4 to 6 until n becomes 0.
Step 8: Display the reversed number.
Step 9: Stop the program.
*/

import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) {
        int n, reverse = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer to reverse:");
        n = in.nextInt();

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of the number is " + reverse);

        in.close();
    }
}

/*
RESULT:
Thus, the given number is reversed successfully.
*/