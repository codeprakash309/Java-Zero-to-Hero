public class Example2 {
    public static void main(String[] args) {
        M1();
        System.out.println(10/0);
    }
    public static void M1() {
        M2();
        System.out.println("Hii");
    }
    public static void M2()
    {
        System.out.println("Hello");
    }
}
