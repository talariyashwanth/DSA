package source.SIH;

public class User {
    protected void sms() {
        System.out.println("SMS in user, accessed from USER Class");
    }
    public static void main(String[] args) {
        User u = new User();
        u.sms();
    }
}

