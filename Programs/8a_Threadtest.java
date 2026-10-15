/*
Experiment No: 8(a)
Title: Creating Simple Threads

AIM:
To create and execute multiple threads in Java using
the Thread class and demonstrate yield(), sleep(),
and thread execution.

ALGORITHM:
Step 1: Start the program.
Step 2: Create three thread classes A, B, and C.
Step 3: Use yield() in thread A.
Step 4: Print values from 1 to 5 in thread A.
Step 5: Print values in thread B and stop its loop
        when j equals 3.
Step 6: Use sleep() in thread C to pause execution
        for 1500 milliseconds.
Step 7: Create objects for all three threads.
Step 8: Start the threads.
Step 9: Stop the program.
*/
import java.io.*;
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C k=" + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        System.out.println("exit from C");
    }
}

class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");
        a.start();

        System.out.println("Start thread B");
        b.start();

        System.out.println("Start thread C");
        c.start();

        System.out.println("exit from main thread");
    }
}

/*
RESULT:
Thus, multiple threads are created and executed
successfully using yield() and sleep() in Java.
*/