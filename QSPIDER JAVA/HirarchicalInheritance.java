class A
{
	int x=50;
		
}
class B extends A 
{
	int y=30;
	int sum;
	public void M1()
		{
	sum=x+y;
	System.out.println("I am inside method of B class....");
	System.out.println("sumof two number is : "+sum);
		}
}
class C extends A
{  
	int z=30;
	int sub;	
	public void M2()	{
		sub=x-z;
		System.out.println("I am inside method of C class....");
	System.out.println("Substraction of two number is : "+sub);
	}
}
class HirarchicalInheritance
{
	public static void main(String[] args) 
	{
		System.out.println("main method  start.....");
		C obj=new C();
		B b=new B();
		obj.M2();
		b.M1();
				
		
	}
}
