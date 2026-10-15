/*
1. AIM:
To write a Java program to demonstrate single inheritance
using College and Department classes.

2. ALGORITHM:
Step 1: Start the program.
Step 2: Create the College class with college and principal names.
Step 3: Create a method to display college details.
Step 4: Create the Department class extending College.
Step 5: Add department name and HOD name.
Step 6: Create an object of Department.
Step 7: Display college and department details.
Step 8: Stop the program.

3. SOURCE CODE:
*/
import java.io.*;
class College {
    String collegeName, principalName;

    College(String collegeName, String principalName) {
        this.collegeName = collegeName;
        this.principalName = principalName;
    }

    void displayCollegeDetails() {
        System.out.println("CollegeName: " + collegeName);
        System.out.println("PrincipalName: " + principalName);
    }
}

class Department extends College {
    String departmentName, HODName;

    Department(String collegeName, String principalName,
               String departmentName, String HODName) {
        super(collegeName, principalName);
        this.departmentName = departmentName;
        this.HODName = HODName;
    }

    void displayDepartmentDetails() {
        System.out.println("DepartmentName: " + departmentName);
        System.out.println("HODName: " + HODName);
    }
}

class SingleInherit {
    public static void main(String[] args) {
        Department obj = new Department(
            "NIT", "B.K.Sinha", "Electronics", "B.C.Rai"
        );

        obj.displayCollegeDetails();
        obj.displayDepartmentDetails();
    }
}

/*
4. RESULT:
Thus, the Java program demonstrating single inheritance
for college and department details was executed successfully.

OUTPUT:
CollegeName: NIT
PrincipalName: B.K.Sinha
DepartmentName: Electronics
HODName: B.C.Rai
*/