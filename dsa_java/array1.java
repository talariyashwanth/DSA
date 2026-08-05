import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter a number: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
