 abstract class A
 {
	 abstract void M1();
	 abstract void M2();
 }
 abstract class B  extends A
 {
	 public void M1()
	 {
    System.out.println("hello");
	 }
 }
class Demo101 
{
	public static void main(String [] args)
	{
  //B obj=new B();
  //obj.M1();
	}
}
 
