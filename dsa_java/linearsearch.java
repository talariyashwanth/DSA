import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Enter element to search : ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Element found");
        } else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
