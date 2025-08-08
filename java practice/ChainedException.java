import java.io.*;
class MyExcept extends Exception
{
     MyExcept(String message)
     {
          super(message);
     }

}
public class ChainedException
{
     public static void main (String args[]) throws MyExcept,IOException
     {
          try
          {
               int rs = 10/0;
               System.out.println(rs);
          }
          catch (Exception e)
          {
               System.out.println (e.getMessage());
               System.out.println (e.getCause());
               throw new MyExcept("Chained ArithmeticException");
          }
     }
}