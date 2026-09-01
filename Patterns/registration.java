import java.util.Scanner;
class User{
    private String Name;
    private int Password;
    
    public User(String Name, int Password){
        this.Name = Name;
        this.Password = Password;
    }

    public String getName(){
        return Name;
    }

    public int getPassword(){
        return Password;
    }
}

public class registration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        User user = null;

        while(true){
            System.out.println("\n-----Registration & Sign In-----");
            System.out.println("Register");
            System.out.println("Sign In");
            System.out.println("Exit");
            System.out.println("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.println("Enter UserName: ");
                String Name = sc.nextLine();
                System.out.println("Enter Password: ");
                int Password = sc.nextLine();

                User = new User(Name,Password);

                System.out.println("Registration successful!");
            }
            else if(choice == 2){
                System.out.println("Enter UserName: ");
                String Name = sc.nextLine();
                System.out.println("Enter Password: ");
                int Password = sc.nextLine();

                if(Name.equals(User.getName()) && Password.equals(User.getPassword())){
                    System.out.println("Sign In Successful!");

                    System.out.println("Welcome, " + User.getName());
                }
                else {
                    System.out.println("Invalid UserName or Password");
                }
            else if(choice == 3){
                    System.out.println("Bye...!");
                    break;
                }
            else{
                    System.out.println("Invalid Choice");
                }
            }
        }
        sc.close();
    }
}