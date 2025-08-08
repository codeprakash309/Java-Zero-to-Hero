class AAA
{
    public static void M1()
    {
        System.out.println("AAA");
    }

}
class BBB extends AAA
{
   public static void M1()
   {
    System.out.println("BBB");
   } 
}
class CCC extends BBB
{
    public static void M1()
    {
        System.out.println("CCC");
    }
}
public class Typecasting2 {
    public static void main(String[] args) {
        CCC c=new CCC();
        c.M1();
        ((BBB)c).M1();
        (AAA)((BBB)c).M1();
    }
}
