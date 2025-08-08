public class Example5 {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try{
            System.out.println("Statement 2");
            System.out.println(10/0);   // ArithmeticException arising in this line
            System.out.println("Statement 4");
        }catch(ArithmeticException e)
        {
            System.out.println(10/2); //handling the above exception here
        }
        System.out.println("Statement 6");
    }
}
