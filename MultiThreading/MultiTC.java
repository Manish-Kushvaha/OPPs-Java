package MultiThreading;
class A extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Process1 "+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Process2 "+i);
        }
    }
}

public class MultiTC {
    public static void main(String[] args){
        System.out.println("Multithreading using Thread class");
        A p1 = new A();
        B p2 = new B();

        p1.start();
        p2.start();

    }
}
