class AA
{
	public void M1()
	{
    System.out.println("A class method");
	}
}
class BB extends AA
{
	public void M2()
	{
    System.out.println("BB class method");
	}
}
class C extends AA
{
	public void M3()
	{
    System.out.println("C class  method");
	}
}
class D extends AA
{
	public void M4()
	{
    System.out.println("D class  method ");
	}
}
class HirarchicalInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("**********A class**********");
		AA a=new AA();
		a.M1();
		System.out.println("**********BB class**********");
		BB b=new BB();
		b.M1();
		b.M2();
		System.out.println("**********C class**********");
		C c=new C();
		c.M1();
		c.M3();
		System.out.println("**********D class**********");
		D d=new D();
		d.M1();
		d.M4();
	}
}
