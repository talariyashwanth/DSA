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
}