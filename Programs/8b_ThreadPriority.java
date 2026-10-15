/*
AIM:
To create multiple threads and set different priorities
using the Thread class in Java.

ALGORITHM:
Step 1: Start the program.
Step 2: Create three thread classes A, B, and C.
Step 3: Define the run() method in each thread.
Step 4: Create objects for all three threads.
Step 5: Set the priority of thread C to maximum.
Step 6: Set the priority of thread B to 6.
Step 7: Set the priority of thread A to minimum.
Step 8: Start all three threads.
Step 9: Display the thread execution messages.
Step 10: Stop the program.
*/
import java.io.*;
class A extends Thread {
    public void run() {
        System.out.println("Thread A started");

        for (int i = 1; i <= 4; i++) {
            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B started");

        for (int j = 1; j <= 4; j++) {
            System.out.println("from thread B j=" + j);
        }

        System.out.println("exit from B");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C started");

        for (int k = 1; k <= 4; k++) {
            System.out.println("thread C k=" + k);
        }

        System.out.println("exit from C");
    }
}

class ThreadPriority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start thread A");
        threadA.start();

        System.out.println("Start thread B");
        threadB.start();

        System.out.println("Start thread C");
        threadC.start();

        System.out.println("End of main thread");
    }
}

/*
RESULT:
Thus, three threads are created and executed with
different priorities using the Thread class in Java.
*/