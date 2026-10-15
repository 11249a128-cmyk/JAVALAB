/*
AIM:
To write a Java program to arrange numbers in ascending order.

ALGORITHM:
Step 1: Start the program.
Step 2: Read the numbers.
Step 3: Compare the numbers.
Step 4: Arrange them from smallest to largest.
Step 5: Display the numbers.
Step 6: Stop the program.
*/
import java.util.*;
class AscendingOrder
{
    public static void main(String[] args)
    {
        int n,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Elements you want in Array");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the Elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n-1]);
    }
}
/*
RESULT:
Thus, the numbers are arranged in ascending order successfully.
*/ 