/*
AIM:
To check whether a number is even or odd.

ALGORITHM:
Step 1: Start the program.
Step 2: Read a number.
Step 3: Divide the number by 2 and check the remainder.
Step 4: If the remainder is 0, display Even.
Step 5: Otherwise, display Odd.
Step 6: Stop the program.
*/



import java.util.*;

public class EvenOdd {
    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("This is Even");
                break;

            case 1:
            case -1:   // Handles negative odd numbers
                System.out.println("This is Odd");
                break;
        }

        s.close();
    }
}
/* /*