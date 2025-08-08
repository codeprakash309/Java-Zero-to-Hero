class P_parent
{
    public void M1()
    {
        System.out.println("parent class method");
    }
}
class C_child extends P_parent{
    public void M2()
    {
        System.out.println("child class method");
    }
}
public class Typecasting {
    public static void main(String[] args) {
      C_child c=new C_child();
      c.M1();
      c.M2();
      ((P_parent)c).M1();
      //((parent)c).M2();
    }
}
