class A implements Runnable {
    public void run() {
        int i = 0;
        while (i++ < 10) {
            System.out.println("Ganeshya Om "+ i);
            // i++;
        }
    }
}

class B implements Runnable {
    public void run() {
        int i = 0;
        while (i++ < 10) {
            System.out.println("Ganeshya Uma "+ i);
            // i++;
        }
    }
}

public class MultiT {
    public static void main(String[] args) {
        System.out.println("Multithreading using Runable Interface");
        A r1 = new A();
        B r2 = new B();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
