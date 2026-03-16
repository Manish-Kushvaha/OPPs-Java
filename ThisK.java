class Demo1 {
    // private int x, y;
    int x, y;

    void fun1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("X is " + this.x + " and Y is " + this.y);
    }
}

class Demo2 extends Demo1{
    int x, y;
    void fun3(int x, int y){
        super.x = x;
        super.y = y;
    }

    void display() {
        System.out.println("X is " + this.x + " and Y is " + super.y);
    }
}

public class ThisK {
    public static void main(String[] args) {
        System.out.println("Jay Ho");
        // Demo1 d1 = new Demo1();
        // d1.fun1(4, 5);
        // d1.display();
        System.out.println("This and Super concepts");
        
        Demo2 d2 = new Demo2();
        d2.fun3(2001,2004);
        d2.display();
    }
}
