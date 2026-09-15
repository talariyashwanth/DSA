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
    }
}
