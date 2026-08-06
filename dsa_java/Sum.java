import java.util.Scanner;

class Calculation {
    int num;
    int sum;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num upto summing : ");
        num = sc.nextInt();
        sc.close();
    }

    void Calculate() {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    void display() {
        System.out.println("Sum of digits : " + sum);
    }

    public static void main(String[] args) {
        Calculation obj = new Calculation();
        obj.input();
        obj.Calculate();
        obj.display();
    }
}
