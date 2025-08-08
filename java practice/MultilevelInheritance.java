class ParentP
{
	public void M1()
	{
		System.out.println("M1 method");
	}
}
class ChildC extends ParentP
{
	public void M2()
	{
		System.out.println("M2 method");
	}
}
class SubChild extends ChildC
{
	public void M3()
	{
       System.out.println("M3 method");
	}
}
class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		SubChild sc=new SubChild();
		sc.M1();
		sc.M2();
		sc.M3();
		System.out.println("*******Parent classs object************");
		ParentP p=new ParentP();
		p.M1();
		//p.M2();
		//p.M3();
		System.out.println("***********Child class object*************");
		ChildC c=new ChildC();
		c.M1();
		c.M2();
		//c.M3();
		System.out.println("*******Parent class reference hold child class object********");
		ParentP p1=new SubChild();
		p1.M1();
		//p1.M2();
		//p1.M3();
		System.out.println("******child class reference hold the subchild class object*****");
		ChildC c1=new SubChild();
		c1.M1();
		c1.M2();
		//c1.M3();
	}
}
