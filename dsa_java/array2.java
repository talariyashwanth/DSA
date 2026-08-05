import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        // Step 1: Take input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Assume first element is largest
        int largest = arr[0];

        // Step 3: Compare remaining elements
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        // Step 4: Print answer
        System.out.println("Largest number = " + largest);

        sc.close();
    }
}