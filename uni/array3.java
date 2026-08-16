import java.util.*;
class Main{
    int i;
    void ReverseArray(int arr[]){
        int n = arr.length;
        for(i = n-1; i >= 0; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void Main(String[] args){
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
        obj.ReverseArray(a);
        sc.close();
    }
}
