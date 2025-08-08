class A
{
	int x=10;
}
class B extends A 
{
	public void M1()
	{
	System.out.println("value of x is : "+x);
	}
}
class Inheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("main method.....");
		B obj=new B();
		obj.M1();
	}
}
