/*
AIM:
To perform arithmetic operations on two numbers.

ALGORITHM:
Step 1: Start the program.
Step 2: Read two numbers.
Step 3: Perform addition, subtraction, multiplication and division.
Step 4: Display the results.
Step 5: Stop the program.
*/

import java.util.*;
public class ArithmeticOperations
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("");
            System.out.println("Enter the two numbers to perform Operations:");
            System.out.println("Enter the first number:");
            int x=s.nextInt();
            System.out.println("Enter the Second Number:");
            int y=s.nextInt();
            System.out.println("Choose the operation you want to perform:");
            System.out.println("Choose 1 for Addition");
            System.out.println("Choose 2 for subtraction");
            System.out.println("Choose 3 for Multiplication");
            System.out.println("Choose 4 for Division");
            System.out.println("Choose 5 for Modulus");
            System.out.println("Choose 6 for Exit");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                    int add;
                    add=x+y;
                    System.out.println("Result:"+add);
                    break;
                case 2:
                    int sub = 0;
                    add=x-y;
                    System.out.println("Result:"+sub);
                    break;
                case 3:
                    int mul = 0;
                    add=x*y;
                    System.out.println("Result:"+mul);
                    break;
                case 4:
                    int div = 0;
                    add=x/y;
                    System.out.println("Result"+div);
                    break;
                case 5:
                    int mod = 0;
                    add=x%y;
                    System.out.println("Result:"+mod);
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }
    
}
/*RESULT:
Thus, arithmetic operations are performed successfully. */