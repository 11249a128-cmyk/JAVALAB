
/*
AIM:
To check whether a number is a perfect number.

ALGORITHM:
Step 1: Start the program.
Step 2: Read a number.
Step 3: Find its proper divisors.
Step 4: Add all the proper divisors.
Step 5: Compare the sum with the original number.
Step 6: If equal, display Perfect Number.
Step 7: Otherwise, display Not a Perfect Number.
Step 8: Stop the program.
*/

import java.util.*;

public class perfect {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any integer you want to check:");
        n = s.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (n > 0 && sum == n) {
            System.out.println("Given number is Perfect");
        } else {
            System.out.println("Given number is not Perfect!!");
        }

        s.close();
    }
}

/*
RESULT:
Thus, the given number is checked successfully.
*/
