/*Finding second largest element in array */
import java.util.Scanner;
public class secondarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int second_largest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
            second_largest = largest;
            largest = arr[i];
        }
        else if(arr[i] > second_largest && arr[i] != largest){
            second_largest = arr[i];
        }
        
    }
    System.out.println("Second largest number is " + second_largest);
    sc.close();
}
}
