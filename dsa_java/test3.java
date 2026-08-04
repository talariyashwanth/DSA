import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print table : ");
        int a = sc.nextInt();
        System.out.println("Table of number " + a + " is");
        for(int i = 1; i <= 10; i++){
            System.out.println(a*i);
        }
        sc.close();
    }
}
