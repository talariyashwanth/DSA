import java.util.*;
public class tea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity for TEA");
        int req = sc.nextInt();
        float avl_M = 20.0f;
        float avl_S = 20.0f;
        float avl_TL = 20.0f;

        float cons_M = 0.5f;
        float cons_S = 0.3f;
        float cons_TL = 0.2f;

        float req_of_M = req*cons_M;
        float req_of_S = req*cons_S;
        float req_of_TL = req*cons_TL;

        if(req_of_M <= avl_M && req_of_S <= avl_S && req_of_TL <= avl_TL){
            System.out.println("Requirement of milk: " + req_of_M);
            System.out.println("Requirement of sugar: " + req_of_S);
            System.out.println("Requirement of tea leaves: " + req_of_TL);
            System.out.println("Available milk: " + avl_M);
            System.out.println("Available sugar: " + avl_S);
        }
    }
}