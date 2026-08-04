import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :- ");
        int a = sc.nextInt();

        System.out.println("Enter second number :- ");
        int b = sc.nextInt();

        System.out.println("Enter thrid number :- ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("First number is largest number " + a);
        } else if (b > c && b > a) {
            System.out.println("Second number is largest number " + b);
        } else {
            System.out.println("Third number is largest " + c);
        }
        sc.close();
    }
}
