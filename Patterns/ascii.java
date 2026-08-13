public class ascii {
    public static void main(String[] args) {
        int abc = 5;
        for(int i = 1; i <= abc; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(64+i);
            }
            System.out.println();
        }
    }
}
