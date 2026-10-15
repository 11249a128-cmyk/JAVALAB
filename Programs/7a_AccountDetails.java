/*
1. AIM:
To write a Java program to demonstrate inheritance using
Account and SBAccount classes.

2. ALGORITHM:
Step 1: Start the program.
Step 2: Create the Account class with account number and balance.
Step 3: Create credit(), debit(), and displayBalance() methods.
Step 4: Create SBAccount class extending Account.
Step 5: Display the interest rate.
Step 6: Create an object and perform credit and debit operations.
Step 7: Display the balance and interest rate.
Step 8: Stop the program.

3. SOURCE CODE:
*/
import java.io.*;
class Account {
    int accountNumber, balance;

    Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void credit(int amount) {
        balance = balance + amount;
    }

    void debit(int amount) {
        balance = balance - amount;
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SBAccount extends Account {
    double rate;

    SBAccount(int accountNumber, int balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    void displayInterestRate() {
        System.out.println("Interest Rate = " + rate);
    }
}

class AccountDemo {
    public static void main(String[] args) {
        SBAccount obj1 = new SBAccount(1001, 5000, 6.5);

        obj1.credit(2000);
        obj1.debit(1000);

        obj1.displayBalance();
        obj1.displayInterestRate();
    }
}

/*
4. RESULT:
Thus, the Java program demonstrating inheritance for
account details was executed successfully.

OUTPUT:
Balance = 6000
Interest Rate = 6.5
*/