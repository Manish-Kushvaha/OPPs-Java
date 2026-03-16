class J1 {
    private int x;
    private static int y;
    void fun1() {
        y = 04;
        x = 05;
        System.out.println("Mohan");
        System.out.println(x);
    }
    
    void fun2() {
        System.out.println("Gopal");
        System.out.println(x);
    }
}

public class Opps {
    public static void main(String args[]) {
        System.out.println("Shree Ganeshay Namah");
        J1 obj1 = new J1(); // Object or Instance 1
        J1 obj2 = new J1(); // object or Instance 2

        obj1.fun1();
        obj2.fun2();
        
    }
}