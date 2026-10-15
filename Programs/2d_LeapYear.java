/*
AIM:
To check whether a given year is a leap year.

ALGORITHM:
Step 1: Start the program.
Step 2: Read the year.
Step 3: Check whether the year is divisible by 400,
        or divisible by 4 but not by 100.
Step 4: If the condition is true, display Leap Year.
Step 5: Otherwise, display Not a Leap Year.
Step 6: Stop the program.
*/


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        sc.close();
    }
}
/*RESULT:
Thus, the given year is checked successfully. */