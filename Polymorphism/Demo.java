class Calculator { // Method overloading

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Calculator2 extends Calculator { // Method overriding

    int add(int a, int b) {
        return a + b + 5;
    }
}

public class Demo {

    public static void main(String[] args) {
        System.out.println("Polymorphism concepts");
        Calculator c1 = new Calculator();
        System.out.println(c1.add(4, 5));
        System.out.println(c1.add(4.5, 5.5));

        Calculator2 c2 = new Calculator2();
        System.out.println(c2.add(4, 5));
    }
}
