class A
{
	int x=10;
	
}
class B extends A 
{
	int y=20;
}
class C extends B
{
	int sum;
	
	public void M1()	{
		sum=x+y;
		System.out.println("I am inside method of C class....");
	System.out.println("Sum of two number is : "+sum);
	}
}
class MultilevelInheritance
{
	public static void main(String[] args) 
	{
		System.out.println("main method  start.....");
		C obj=new C();
		obj.M1();
		
	}
}
