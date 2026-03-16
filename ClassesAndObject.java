class Nokia {
    private int vol;
    private int cam;

    void setValue() {
        vol = 100;
        cam = 450;
    }

    void display() {
        System.out.println(vol + " " + cam);
    }
}

public class ClassesAndObject {

    public static void fun1() {
        System.out.println("RadhaMohan");
    }

    public static void main(String[] args) {
        System.out.println("Shree");
        Nokia obj1 = new Nokia();
        fun1();
        // obj1.setValue();
        // obj1.display();
    }
}
