class string {
    public static void main(String[] args) {
        String a = new String("Yashwanth");
        String b = new String("Yashwanth");
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        StringBuffer c = new StringBuffer("Yashwanth");
        System.out.println(a.equals(b));
        System.out.println(c.equals(b));
        // String a = new String("Yashwanth").intern();
        // String b = new String("Yashwanth").intern();
        // String c = "Yashwanth";
        // String d = "Yashwanth";
        // System.out.println(a == b);
        // System.out.println(c == d);
        // System.out.println(a == c);
    }
}