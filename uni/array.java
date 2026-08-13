import java.util.*;
class Main{
    int i;
    void PrintArray(int arr[]){
        for(i = 0; i < arr.length; i++){
            System.out.println("Array element is: " + arr[i]);
        }
    }
    public static void main(String[] args){
        int n, k;
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements in a array");
        for(k = 0; k<n; k++){
            a[k] = sc.nextInt();
        }
        obj.PrintArray(a);
        sc.close();
    }
}