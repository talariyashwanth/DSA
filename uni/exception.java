class Main {
    public static void main(String[] args) 
    {
        try
    
    {
        int diveByZero = 6 / 2;
        float result = diveByZero;
        System.out.println("Rest of code in try block " + result);
    }
    catch (ArithmeticException e) {
        System.out.println("Arithmatic Exception => " + e.getMessage());
        }
    }
}