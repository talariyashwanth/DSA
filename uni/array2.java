import java.util.*;
class Main{
    int i;
    void maxMin(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for(i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Maximum Element : " + max);
        System.out.println("Maximum Element : " + min);
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
        obj.maxMin(a);
        sc.close();
    }
}
