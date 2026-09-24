class Animal{
    void sound() {
        System.out.println("Animal makes a sound : ");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion Roars");
    }
}

class Horse extends Animal {
    void sound() {
        System.out.println("Horse Neighs");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Lion();
        a.sound();

        a = new Horse();
        a.sound();
    }
}

