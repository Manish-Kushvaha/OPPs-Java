package MultiThreading;
import java.util.Scanner;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    boolean isSufficient(int w) {
        if (bal > w)
            return true;
        else {
            return false;
        }
    }

    void withdraw(int amt, String g1) {
        bal = bal - amt;
        System.out.println(g1 + " Transaction successfull");
        System.out.println(g1 + " Current Balance is " + bal);
    }
}

class Customer implements Runnable {
    Account x1;
    String s1;

    Customer(Account j1, String h1) {
        x1 = j1;
        s1 = h1;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        synchronized (x1) {
            System.out.println("Enter amount to withdraw for " + s1 + " :");
            int amt = sc.nextInt();
            if (x1.isSufficient(amt)) {
                x1.withdraw(amt, s1);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

public class ThreadSyn {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Ram");
        Customer c2 = new Customer(a1, "Sham");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
