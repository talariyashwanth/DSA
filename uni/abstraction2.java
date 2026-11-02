abstract class Mother {
    abstract void eating();
    void sleep() {
        System.out.println("Child is sleeping");
    }
}

class Child extends Mother {
    void eating() {
        System.out.println("Child is eating");
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.sleep();
        c.eating();
    }
}
