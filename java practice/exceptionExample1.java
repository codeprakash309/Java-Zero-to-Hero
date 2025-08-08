public class exceptionExample1 {
    public static void main(String[] args) {
        int x=10;
        int result=0;
        try{
            result=x/0;

        }
        catch(Exception e)
        {
            System.out.println("divisible  by zero");
        }
        

    }
}
