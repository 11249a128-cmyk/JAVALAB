
/*
AIM:
To calculate the perimeter and area of a square,
circle, and triangle using Java packages.

ALGORITHM:
Step 1: Start the program.
Step 2: Import the Shape package and Scanner class.
Step 3: Read the side of the square and calculate its
        perimeter and area.
Step 4: Read the radius of the circle and calculate its
        perimeter and area.
Step 5: Read the three sides of the triangle and calculate
        its perimeter and area.
Step 6: Display all the results.
Step 7: Stop the program.
*/

import Shape.*;
import java.util.*;

class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the Square:");
        int s = sc.nextInt();

        Square sq = new Square(s);
        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println("Area of Square is " + sq.area());

        System.out.println("Enter the radius of the Circle:");
        int r = sc.nextInt();

        // Corrected: use r, the circle's radius
        Circle ci = new Circle(r);
        System.out.println("Perimeter of Circle is " + ci.perimeter());
        System.out.println("Area of Circle is " + ci.area());

        System.out.println("Enter the Side1 of the Triangle:");
        int s1 = sc.nextInt();

        System.out.println("Enter the Side2 of the Triangle:");
        int s2 = sc.nextInt();

        System.out.println("Enter the Side3 of the Triangle:");
        int s3 = sc.nextInt();

        Triangle t = new Triangle(s1, s2, s3);
        System.out.println("Perimeter of Triangle is " + t.perimeter());
        System.out.println("Area of Triangle is " + t.area());

        sc.close();
    }
}

/*
RESULT:
Thus, the perimeter and area of the square, circle,
and triangle are calculated successfully using Java packages.
*/