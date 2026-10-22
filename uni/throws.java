class ThrowsDemo {
    public static void checkNumber(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Numbers cannot be negative");
        }
        else {
            System.out.println("Number is " + number);
        }
    }
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
    }
}