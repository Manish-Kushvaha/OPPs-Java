package Inheritance;
class Nokia1 {
    int x = 5;
    void f1(){
        System.out.println(x);
    }
    // private int x, y;
    // Nokia1(int a, int b) {
    //     x=a;y=b;
    //     System.out.println("Jay Ho 1"+x+" "+y);
    // }

    // void f1() {
    //     System.out.println("Fun 1");
    // }

    // void f2() {
    //     System.out.println("Fun 2");
    // }
}

class Nokia2 extends Nokia1 {
    int x = 10;
    void f1(){
        System.out.println(x);
    }
    // Nokia2() {
    //     super(4,5);
    //     System.out.println("Jay Ho 2");
    // }

    // void f3() {
    //     System.out.println("Fun 3");
    // }
}

public class Inherit {
    public static void main(String[] args) {
        Nokia2 n1 = new Nokia2();
        n1.f1();
        Nokia1 n2 = new Nokia1();
        n2.f1();
    }
}
