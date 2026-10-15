/*
AIM:
To write a Java program to print all substrings of a given string
and count the total number of substrings.

ALGORITHM:
Step 1: Start the program.
Step 2: Read a string from the user.
Step 3: Find the length of the string.
Step 4: Use an outer loop to select the starting position.
Step 5: Use an inner loop to find all possible substrings.
Step 6: Print each substring and increase the count.
Step 7: Display the total number of substrings.
Step 8: Stop the program.
*/

import java.util.Scanner;

class Substring {
    public static void main(String args[]) {
        String string, sub;
        int length, count = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to print all its substrings:");
        string = in.nextLine();

        length = string.length();

        System.out.println("Substrings of \"" + string + "\" are:");

        for (int c = 0; c < length; c++) {
            for (int i = 1; i <= length - c; i++) {
                sub = string.substring(c, c + i);
                System.out.println(sub);
                count++;
            }
        }

        System.out.println("No. of substrings present are: " + count);

        in.close();
    }
}

/*
RESULT:
Thus, all substrings of the given string are printed
and counted successfully.
*/