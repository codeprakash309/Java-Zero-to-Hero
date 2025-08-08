//Write a JAVA program for computing sum of two integers and floats using abstract classes?
abstract class AbstractTest 
{
	abstract void sum();
}
class isum extends AbstractTest
{
	public void sum()
	{
		int x=10;
		int y=20;
        int iadd=x+y;
	System.out.println("INT-Value  : "+iadd);
	}
}
class fsum extends AbstractTest
{
	public void sum()
	{
		float f1=5.5f;
		float f2=7.7f;
       float fadd=f1+f2;
	 System.out.println("FLOAT-Value : "+fadd);
	}
}
class AbstractDemo  
{
	public static void main(String[] args) 
	{
         //AbstractTest obj=new AbstractTest();   //we can not create object of an abstract class directly
		 AbstractTest obj;
		obj=new isum();
		obj.sum();
		obj=new fsum();
		obj.sum();
	}
}
