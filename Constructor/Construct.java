package Constructor;
// class Demo{
//     int x, y;
//     Demo(int a, int b){
//         x=a;
//         y=b;
//     }
// }

import Inheritance.Demo2;

class Demo{
    Demo(){
        System.out.println("Parent");
    }
}

class Demo2 extends Demo{
    Demo2(){
        // super(); 
        System.out.println("Child");
    }
}

public class Construct {
    public static void main(String[] args) {
        System.out.println("Constructor concepts");
        // Demo d1 = new Demo(4,5);
        // Demo d2 = new Demo(8,9);
        // // Demo d3 = new Demo();
        // System.out.println(d1.x);
        // System.out.println(d2.x);
        Demo2 d1 = new Demo2();

    }
}
