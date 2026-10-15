/*
AIM:
To write a Java program to search for an element using binary search.

ALGORITHM:
Step 1: Start the program.
Step 2: Read the sorted array and search element.
Step 3: Find the middle element.
Step 4: Compare it with the search element.
Step 5: Repeat the search in the left or right half.
Step 6: Display whether the element is found.
Step 7: Stop the program.
*/


import java.util.*;
class BinarySearch
{
    public static void main(String arg[])
    {
        int i,mid,first,last,x,n,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of Array:");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the Elements to search:");
        x=sc.nextInt();
        first=0;
        last=n-1;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(a[mid]>x)
                last=mid-1;
            else
                if(a[mid]<x)
                    first=mid+1;
            else
            {
                flag=1;
                System.out.println("Element Found");
                break;
            }
        }
        if(flag==0)
            System.out.println("Element not found");
    }
}
/*RESULT:
Thus, the element is searched using binary search successfully.
*/