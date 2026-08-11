package JAVA_FSD_A1_2025281724;

/*Read two integers a and b. Print their sum, difference, product, 
integer quotient, remainder, and the exact quotient as a double. */

import java.util.Scanner;
public class artihmatic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:- ");
        int a = sc.nextInt();
        System.out.println("Input b:- ");
        int b = sc.nextInt();

        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder = a%b;
        double exact = (double) a / b; 

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
        System.out.println("Exact : " + exact);
        
        sc.close();
    }
}
