class Buffer {
    int data;
    boolean available;
    synchronized void produce(int v) throws InterruptedException {
        while (available)
            wait();
        data = v;
        available = true;
        System.out.println("Produced: " + v);
        notify();
    }
    synchronized void consume() throws InterruptedException {
        while (!available)
            wait();
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}
public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.produce(i);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
            }
        }).start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.consume();
                    Thread.sleep(800);
                }
            } catch (Exception e) {
            }
        }).start();
    }
}