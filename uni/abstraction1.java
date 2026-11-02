abstract class Animal {
    abstract void animalSound();
    void Sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Elephant extends Animal {
    void animalSound() {
    System.out.println("Animal is sounding");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.animalSound();
        e.Sleep();
    }
}