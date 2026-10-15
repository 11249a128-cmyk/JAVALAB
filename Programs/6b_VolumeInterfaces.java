/*
1. AIM:
To calculate the volume of a cylinder and the surface
area of a sphere using Java interfaces.

2. ALGORITHM:
Step 1: Start the program.
Step 2: Create Shape and CylinderShape interfaces.
Step 3: Implement the interfaces using Cylinder and Sphere classes.
Step 4: Get radius and height from the user.
Step 5: Calculate the volume of the cylinder.
Step 6: Calculate the surface area of the sphere.
Step 7: Display the results.
Step 8: Stop the program.

3. CODE:
*/

import java.util.Scanner;

interface Shape {
    float pi = 3.14f;
    float area(int r);
}

interface CylinderShape {
    float pie = 3.14f;
    float volume(int r, int h);
}

class Cylinder implements CylinderShape {
    public float volume(int r, int h) {
        return pie * r * r * h;
    }
}

class Sphere implements Shape {
    public float area(int r) {
        return 4 * pi * r * r;
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        int r, h;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius and height: ");
        r = sc.nextInt();
        h = sc.nextInt();

        Cylinder c1 = new Cylinder();
        Sphere s1 = new Sphere();

        System.out.println("Volume of Cylinder: " + c1.volume(r, h));
        System.out.println("Surface Area of Sphere: " + s1.area(r));

        sc.close();
    }
}

/*
4. RESULT:
Thus, the volume of the cylinder and the surface area
of the sphere are calculated successfully using interfaces.
*/