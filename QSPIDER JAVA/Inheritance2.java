class A
{
	int x=10;
	public void M1(){
	System.out.println("i am inside the class A");
	}
}
class B extends A 
{
	public void M1()
	{

	System.out.println("i am inside the class B");
	System.out.println("value of x is : "+x);
	}
}
class Inheritance2 
{
	public static void main(String[] args) 
	{
		System.out.println("main method  start.....");
		B obj=new B();
		obj.M1();
		
	}
}
