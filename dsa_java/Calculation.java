import java.util.Scanner;

class Rectangle {
    int a;
    int b;
    int area;
    int perimeter;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        a = sc.nextInt();
        System.out.println("Enter breadth : ");
        b = sc.nextInt();
    }

    void Calculate_area() {
        area = a * b;
    }

    void Calculate_perimeter() {
        perimeter = 2 * (a + b);
    }

    void display() {
        System.out.println("Area and Perimeter of rectangle are : ");
        System.out.println("Area " + area);
        System.out.println("Perimeter : " + perimeter);
    }
}

class Calculation {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.Calculate_area();
        obj.Calculate_perimeter();
        obj.display();
    }
}
