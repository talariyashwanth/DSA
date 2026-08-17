import java.util.Scanner;

class Vehicle {
    void show() {
        System.out.println("This is a Vehicle");
    }
}

class TwoWheeler extends Vehicle {
    void show2Wheeler() {
        System.out.println("2 Wheeler");
    }
}

class Hero extends TwoWheeler {
    void showHero() {
        System.out.println("You selected Hero");
    }
}

class W4 extends Vehicle {
    void show4Wheeler() {
        System.out.println("4 Wheeler");
    }
}

class Car extends W4 {
    void showCar() {
        System.out.println("You selected Car");
    }
}

public class Vehicles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Vehicle Type");
        System.out.println("1. 4W");
        System.out.println("2. 2W");
        System.out.println("Enter Choice");

        int option = sc.nextInt();

        if (option == 1) {

            System.out.println("Select 4 Wheeler");
            System.out.println("1. Car");

            int choice = sc.nextInt();

            if (choice == 1) {
                Car c = new Car();
                c.show();
                c.show4Wheeler();
                c.showCar();
            }

        } else if (option == 2) {

            System.out.println("Select 2 Wheeler");
            System.out.println("1. Hero");

            int choice = sc.nextInt();

            if (choice == 1) {
                Hero h = new Hero();
                h.show();
                h.show2Wheeler();
                h.showHero();
            }

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}