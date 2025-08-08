class example1{
    public static void main(String[] args) {
        M1();
    }
    public static void M1()
    {
        M2();
    }
    public static void M2() {
        System.out.println(10/0);
    }
}