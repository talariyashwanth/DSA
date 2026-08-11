package JAVA_FSD_A1_2025281724;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        String parity = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(parity);
        
        int lastDigit = (n % 10 < 0) ? -(n % 10) : (n % 10);
        System.out.println("Last digit: " + lastDigit);
        
        scanner.close();
    }
}
