package Inheritance;
interface i1{
    int x = 5; // By default x is public, static and final
    void f1();

    static void f2(){
        System.out.println(x);
    }
}

interface i2 extends i1{
    int y = 04;
    int x = 9;
    
    static void f2(){
        System.out.println(x);
    }
    void f3();
}

class Demo implements i2{
    void f2(){
        System.out.println(x);
    }
    public void f1(){

    }
    public void f3(){

    }
}

public class InterF {
    public static void main(String[] args){
        System.out.println("Interface");
        // Demo d1 = new Demo();
        // // System.out.println(d1.y);
        // d1.f2();
        System.out.println("Interface concepts");
        i2.f2();
        i1.f2();
    }
}
