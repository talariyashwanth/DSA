package JAVA_FSD_A1_2025281724;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate (% p.a.): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double maturityAmount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = maturityAmount - principal;

        System.out.printf("Simple Interest = %.2f\n", simpleInterest);
        System.out.printf("Compound Interest = %.2f\n", compoundInterest);
        System.out.printf("Maturity (P + CI) = %.2f\n", maturityAmount);

        scanner.close();
    }
}

