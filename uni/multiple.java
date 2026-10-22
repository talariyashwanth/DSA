public class multiple {
    public static void main(String[] args) {
        try {
            int x[] = new int[5];
            x[5] = 40 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bonds Exception Occurs");
        }
        catch (Exception e) {
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("The program ends here");
    }
}
