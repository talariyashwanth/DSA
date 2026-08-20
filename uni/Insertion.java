import java.util.*;
public class Insertion{
    int len = arr.length;
    for(int i = 1; i < len; i++){
        int key = arr[i];
        int j = i-1;
        while(j >= 0 && key < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;

    public static void main(String[] args){
        Insetion Obj = new Insertion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("After sorting, the elements in array: ");
        Obj.insertionSort(arr);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    }
}