/*
AIM:
To write a Java program to replace a substring in a given string.

ALGORITHM:
Step 1: Start the program.
Step 2: Read a string from the user.
Step 3: Read the substring to be replaced.
Step 4: Read the new substring.
Step 5: Use the replace() method to replace the substring.
Step 6: Display the modified string.
Step 7: Stop the program.
*/

import java.util.*;

class ReplacingSubstring {
    public static void main(String args[]) {
        String a, e;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s1 = sc.nextLine();

        System.out.println("Enter the substring to be replaced:");
        a = sc.next();

        System.out.println("Enter the new substring:");
        e = sc.next();

        String replaceString = s1.replace(a, e);

        System.out.println("Modified string: " + replaceString);

        sc.close();
    }
}

/*
RESULT:
Thus, the specified substring is replaced successfully.
*/