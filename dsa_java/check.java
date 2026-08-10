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

n=int(input())print(" "*(2*(n-1))+"* ")for

i in

range(1,n):
  print(" "*(n-i)+"* "+" "*(2*(i))+"*")
for i in range(1,n-1):
  print(" "*(2*i)+"* "+" "*((n-i))+"*")
print(" "*(2*(n-1))+"*")