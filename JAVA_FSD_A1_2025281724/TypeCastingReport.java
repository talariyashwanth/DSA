package JAVA_FSD_A1_2025281724;

public class TypeCastingReport {
    public static void main(String[] args) {
        
        int originalInt = 42;
        long widenedLong = originalInt; // Automatically converts int to long
        double widenedDouble = widenedLong; // Automatically converts long to double

        // Display widening results
        System.out.println("Widening : " + originalInt + " -> " + widenedLong + " -> " + widenedDouble);

        // (ii) Narrowing conversion: double -> int
        double originalDouble = 99.99;
        int narrowedInt = (int) originalDouble; // Manually casts double to int (truncates decimals)

        // Display narrowing results
        System.out.println("Narrowing: " + originalDouble + " -> " + narrowedInt);

        // (iii) Character to Unicode code point conversion
        char characterA = 'A';
        int codeA = characterA; // Automatically converts char to its ASCII/Unicode int value

        // Display char to int result
        System.out.println("'" + characterA + "' code : " + codeA);

        // (iii) Unicode code point to character conversion
        int codeB = 66;
        char characterB = (char) codeB; // Manually casts int to its corresponding char value

        // Display int to char result
        System.out.println(codeB + " char : " + characterB);
    }
}
