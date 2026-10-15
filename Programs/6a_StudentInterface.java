/*
AIM:
To calculate student percentage using an interface
and inheritance in Java.

ALGORITHM:
Step 1: Start the program.
Step 2: Create the Exam interface with percent_cal().
Step 3: Create the StudentInterface class to store student details.
Step 4: Create the Result class extending StudentInterface
        and implementing the Exam interface.
Step 5: Calculate the total marks and percentage.
Step 6: Display student details and percentage.
Step 7: Stop the program.
*/

interface Exam {
    void percent_cal();
}

class StudentInterface {
    String name;
    int roll_no, mark1, mark2;

    StudentInterface(String n, int r, int m1, int m2) {
        name = n;
        roll_no = r;
        mark1 = m1;
        mark2 = m2;
    }

    void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No. of Student: " + roll_no);
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
    }
}

class Result extends StudentInterface implements Exam {

    Result(String n, int r, int m1, int m2) {
        super(n, r, m1, m2);
    }

    public void percent_cal() {
        int total = mark1 + mark2;
        float percent = total * 100.0f / 200;
        System.out.println("Percentage: " + percent + "%");
    }
}

class StudentInterfaceMain {
    public static void main(String[] args) {
        Result r = new Result("Ragini", 12, 93, 84);

        r.display();
        r.percent_cal();
    }
}

/*
RESULT:
Thus, student details and percentage are displayed
successfully using an interface and inheritance.
*/