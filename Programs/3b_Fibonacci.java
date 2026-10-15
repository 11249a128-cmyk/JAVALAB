/*
AIM:
To generate the Fibonacci series.

ALGORITHM:
Step 1: Start the program.
Step 2: Read the number of terms.
Step 3: Initialize the first two terms as 0 and 1.
Step 4: Display the terms.
Step 5: Add the previous two terms to get the next term.
Step 6: Repeat until the required number of terms is reached.
Step 7: Stop the program.
*/


import java.util.*;
public class Fibonacci{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=s.nextInt();
        Fibonacci(n);
    }
    public static void Fibonacci(int n)
    {                                                  
        if(n==0)
        {
            System.out.println('0');
        }else if(n==1)
        {
            System.out.println("01");
        }else{
            System.out.println("01");
            int a=0,b=1;
            for(int i=1;i<n;i++)
            {
                int nextNumber=a+b;
                System.out.println(nextNumber+"");
                a=b;
                b=nextNumber;
            }
        }
    }
}
/*RESULT:
Thus, the Fibonacci series is generated successfully. */