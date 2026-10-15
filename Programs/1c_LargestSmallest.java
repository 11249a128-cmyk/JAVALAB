/*
AIM:
To find the largest and smallest numbers in an array.

ALGORITHM:
Step 1: Start the program.
Step 2: Read the array elements.
Step 3: Assume the first element is largest and smallest.
Step 4: Compare the remaining elements.
Step 5: Update the largest and smallest values.
Step 6: Display the results.
Step 7: Stop the program.
*/

public class LargestSmallest 
{
    public static void main(String[] args)
    {
        int[] a={23,66,45,78,46,12,17,91};
        int sum=a[0];
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
            sum=sum+a[i];
        }
        System.out.println("The sum is:"+sum);
        System.out.println("Largest Number in the given array is:"+max);
        System.out.println("Smallest Number in the given array is:"+min);

    }
}
/* RESULT:
Thus, the largest and smallest numbers are found successfully.*/