/*
AIM:
To write a Java program to process student marks.

ALGORITHM:
Step 1: Start the program.
Step 2: Read the student marks.
Step 3: Check the required marks condition.
Step 4: Calculate or display the result as required.
Step 5: Stop the program.
*/


import java.util.Scanner;

public class MarksAbvsixty {
    public static void main(String args[]) {
        int marks[] = new int[6];
        String name[] = new String[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the Name of Student and Marks of Student " + (i + 1) + ": ");
            name[i] = sc.next();
            marks[i] = sc.nextInt();
        }

        System.out.println("\nStudents Scoring 60 marks and above:");

        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }

        sc.close();
    }
}
/* RESULT:
Thus, the student marks are processed successfully.*/