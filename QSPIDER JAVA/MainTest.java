interface X
{
	int a=10;
	M1();	
}
class A implements X
{
	M1()
	{
    System.out.println("dubi dubi....");
	}
	public static void main(String []args)
	{
    A obj=new A();
	obj.M1();
	System.out.println(obj.a);
	}
}