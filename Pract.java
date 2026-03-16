class Parent{
    int age = 21;
    String name = "Mohan";

    void display(){
        System.out.println("My name is "+ name + " and my age is "+age);
    }
}

class child extends Parent{
    int age = 22;
    String name = "Ram";
    @Override
    void display(){
        System.out.println("Shree Ganeshay Namah " +age);
    }
}

public class Pract{
    public static void main(String[] args){
        Parent obj = new child();
        obj.display();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}