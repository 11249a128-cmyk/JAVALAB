
/*
Experiment No: 10(b)
Title: FileWriter

AIM:
To write uppercase alphabets from A to Z into a text file
using the FileWriter class in Java.

ALGORITHM:
Step 1: Start the program.
Step 2: Create a FileWriter object for sample2.txt.
Step 3: Use a loop to generate characters from A to Z.
Step 4: Write each character into the file.
Step 5: Close the FileWriter.
Step 6: Handle exceptions if they occur.
Step 7: Stop the program.
*/

import java.io.*;

class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample2.txt");

            for (char i = 65; i <= 90; i++) {
                fw.write(i);
            }

            fw.close();

            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

/*
RESULT:
Thus, uppercase alphabets from A to Z are written
successfully into sample2.txt using FileWriter.
*/