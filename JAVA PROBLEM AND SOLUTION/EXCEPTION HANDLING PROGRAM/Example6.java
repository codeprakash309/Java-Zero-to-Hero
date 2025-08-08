//Method to print Exception information
public class Example6 {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.print("Exception information : ");
           e.printStackTrace(); 
           System.out.println("Name of the Exception : "+e);
           System.out.println("Name of the Exception : "+e.getMessage());
        }
    }
}
