/*
AIM:
To print the multiplication table of a given number.

ALGORITHM:
Step 1: Start the program.
Step 2: Read a number.
Step 3: Initialize i = 1.
Step 4: Multiply the number by i.
Step 5: Display the result.
Step 6: Increase i by 1 and repeat up to 10.
Step 7: Stop the program.
*/

import java.util.*;

class MulTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int no = 0;

        System.out.println("Enter the Number:");
        no = sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(no + "*" + i + "=" + (no * i));
        }

        sc.close();
    }
}
/*RESULT:
Thus, the multiplication table is displayed successfully. */