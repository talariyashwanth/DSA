import java.util.Scanner;

class User {

    private String Name;
    private String Password;

    public User(String Name, String Password) {
        this.Name = Name;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }
}

public class registrationgpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = null;

        while (true) {

            System.out.println("\n----- Registration & Sign In -----");
            System.out.println("1. Register");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter UserName: ");
                String Name = sc.nextLine();

                System.out.print("Enter Password: ");
                String Password = sc.nextLine();

                user = new User(Name, Password);

                System.out.println("Registration successful!");
            }

            else if (choice == 2) {

                if (user == null) {
                    System.out.println("Please register first.");
                    continue;
                }

                System.out.print("Enter UserName: ");
                String Name = sc.nextLine();

                System.out.print("Enter Password: ");
                String Password = sc.nextLine();

                if (Name.equals(user.getName()) &&
                    Password.equals(user.getPassword())) {

                    System.out.println("Sign In Successful!");
                    System.out.println("Welcome, " + user.getName());
                }

                else {
                    System.out.println("Invalid UserName or Password");
                }
            }

            else if (choice == 3) {

                System.out.println("Bye...!");
                break;
            }

            else {

                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}
