class Student {
    String name;
    int roll;

    Student() {
        name = "Unknown";
        roll = 0;
    }

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println();
    }
}

public class student{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Yashwanth", 2025281724);
        s1.display();
        s2.display();
    }
}
