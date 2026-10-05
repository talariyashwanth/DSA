class demo {
    static void output(int a){
        System.out.println("Integer a : " + a);
    }
    static void output(float b){
        System.out.println("Float b is : " + b);
    }
    public static void main(String[] args){
        output(10);
        output(5.5f);
    }
}