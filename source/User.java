package source;

public class User {
    protected void sms() {
        System.out.println("SMS in user");
    }
    public static void main(String[] args) {
        User u = new User();
        u.sms();
    }
}

