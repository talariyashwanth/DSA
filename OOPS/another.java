class Person {
    void work() {
        System.out.println("Person work");
    }
}
class Student extends Person {
    @Override
    void work() {
        System.out.println("Study");
    }
}
public class another {
    public static void main(String[] args) {
        Person a = new Student();
        a.work();
    }
}