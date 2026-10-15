/*
Experiment No: 10(a)
Title: FileReader

AIM:
To read and display the contents of a text file
using the FileReader class in Java.

ALGORITHM:
Step 1: Start the program.
Step 2: Create a FileReader object for sample2.txt.
Step 3: Read one character at a time from the file.
Step 4: Continue reading until the end of the file.
Step 5: Display each character.
Step 6: Close the FileReader.
Step 7: Handle exceptions if they occur.
Step 8: Stop the program.
*/

import java.io.*;

class Filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample2.txt");
            int i;

            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

/*
RESULT:
Thus, the contents of sample2.txt are read and displayed
successfully using the FileReader class.
*/