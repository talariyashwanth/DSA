class Printer {
    // Method Overloading: Same method name 'show', first int then float parameter
    void show(int a) {
        System.out.println("Overloaded method - Integer: " + a);
    }

    void show(float b) {
        System.out.println("Overloaded method - Float: " + b);
    }

    // Base method for Overriding
    void display() {
        System.out.println("Display from Parent class");
    }
}

class SubPrinter extends Printer {
    // Runtime Polymorphism: Method Overriding
    @Override
    void display() {
        System.out.println("Display from Child class (Runtime Polymorphism)");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Method Overloading test
        Printer p = new Printer();
        p.show(10);      // Calls show(int)
        p.show(5.5f);    // Calls show(float)

        // 2. Runtime Polymorphism test (Parent reference holding Child object)
        Printer obj = new SubPrinter();
        obj.display();   // Decided at runtime to run SubPrinter's display()
    }
}
