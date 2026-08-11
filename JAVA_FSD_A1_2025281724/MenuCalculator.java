package JAVA_FSD_A1_2025281724;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter operator (+ - * / %): ");
        char operator = input.next().charAt(0);

        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    isValid = false;
                } else {
                    result = a / b;
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    isValid = false;
                } else {
                    result = a % b;
                }
                break;
            default:
                System.out.println("Invalid operator");
                isValid = false;
                break;
        }

        // Print output if the operation was successful
        if (isValid) {
            System.out.printf("%.2f %c %.2f = %.2f\n", a, operator, b, result);
        }

        input.close();
    }
}

