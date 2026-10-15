/*
AIM:
To check whether a number is an Armstrong number.

ALGORITHM:
Step 1: Start the program.
Step 2: Read a number.
Step 3: Find the number of digits.
Step 4: Calculate the sum of each digit raised to
        the power of the number of digits.
Step 5: Compare the sum with the original number.
Step 6: Display whether it is an Armstrong number.
Step 7: Stop the program.
*/

import java.util.*;

public class Armstrong
{
    public static void main(String args[])
    {
        int n,nu,num=0,rem;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any postivive number:");
        n=scan.nextInt();
        nu=n;
        while(nu!=0)
        {
            rem=nu%10;
            num=num+rem*rem*rem;
            nu=nu/10;
        }
        if(num==n)
        {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
/*RESULT:
Thus, the given number is checked successfully. */