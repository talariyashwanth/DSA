class Main {
    public static void main(String[] args) 
    {
        try
    
    {
        int diveByZero = 5 / 0;
        System.out.println("Rest of codde in try block");
    }
    catch (ArithmeticException e) {
        System.out.println("Arithmatic Exception => " + e.getMessage());
        }
    }
}