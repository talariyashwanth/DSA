/* Divisibility check by 3 and 5 */
class Divisible {
    void Calculation() {
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Numbers divisible by 3 and 5 are : " + i);
            }
        }
    }

    public static void main(String[] args) {
        Divisible obj = new Divisible();
        obj.Calculation();
    }
}