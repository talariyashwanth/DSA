package JAVA_FSD_A1_2025281724;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsiusIn = input.nextDouble();
        double fahrenheitOut = (celsiusIn * 9.0 / 5.0) + 32.0;
        System.out.printf("%.1f C = %.1f F%n", celsiusIn, fahrenheitOut);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheitIn = input.nextDouble();
        double celsiusOut = (fahrenheitIn - 32.0) * 5.0 / 9.0;
        System.out.printf("%.1f F = %.2f C%n", fahrenheitIn, celsiusOut);

        input.close();
    }
}
