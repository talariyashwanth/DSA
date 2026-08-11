package JAVA_FSD_A1_2025281724;
/* Read the radius (double). Print the area and circumference using Math.PI, both rounded to 2 decimal places with printf. */
import java.util.Scanner;
public class circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:- ");
        double radius = sc.nextDouble();
        double area = 3.14*(radius*radius);
        double circum = 2*3.14*radius;
        System.out.println("Area 0f Circle: " + area);
        System.out.println("Circumference of Circle: " + circum);
        sc.close();

    }
}
