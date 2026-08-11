package JAVA_FSD_A1_2025281724;
/* Read two integers and swap them using arithmetic only — no temporary variable. 
Print the values before and after. */
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After : a = " + a + ", b = " + b);
        
        scanner.close();
    }
}
