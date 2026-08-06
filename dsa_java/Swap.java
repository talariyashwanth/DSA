import java.util.Scanner;
class swap{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
    }
    void Swap(){
        int temp = a;
        a = b;
        b = temp;
    }
    void display(){
        System.out.println("After Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        }
    }
    public class Swap{
        public static void main(String[] args) {
            swap obj = new swap();
            obj.input();
            obj.Swap();
            obj.display();
        }
    }

