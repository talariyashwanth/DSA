public class block {
    public static void main(String[] args) {
        try {
            int divideByZero = 5/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception => " + e.getMessage());
        }
        finally {
            System.out.println("This is my finally block");
        }
    }
}