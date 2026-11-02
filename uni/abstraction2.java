abstract class Mother {
    abstract void read();
    void write() {
        System.out.println("Mother is writing a letter");
    }
}

class Child extends Mother {
    void read() {
        System.out.println("Child is reading");
    }
    void cry() {
        System.out.println("Child is crying");
    }
    void eating() {
        System.out.println("Child is eating");
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.write();
        c.read();
        c.cry();
        c.eating();
    }
}
