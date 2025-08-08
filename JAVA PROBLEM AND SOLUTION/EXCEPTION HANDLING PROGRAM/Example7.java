//try-catch and finally block
public class Example7 {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try {
       //exception can aries in your code then you must have write the code here , then you can easily handle it 
            System.out.println("I am Try block");
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            //my job is to handle the exception
            System.out.println("i am Catch block");
            System.out.println(10/2);
        }
        finally{
            //my job is to clean up activity
            System.out.println("I am finally method.......");
        }
    }
}
