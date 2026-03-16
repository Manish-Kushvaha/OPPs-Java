package Abstraction;
abstract class Demo1{
    int a;
    void fun1(){
        System.out.println("Abstact class");
    }
    abstract void fun2();
}

class Demo2 extends Demo1{
    void fun2(){
        System.out.println("Overriding of fun2 of abstract class");
    }
}

public class Abs {
    public static void main(String[] args){
        // Demo1 d1 = new Demo1(); //Cannot instantiate the type Demo1
        System.out.println("Abstraction concept");
        Demo2 d1 = new Demo2();
        d1.fun2();
        d1.fun1();
    }
}
