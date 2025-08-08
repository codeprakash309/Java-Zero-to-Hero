class Parent
{
	public static void Method1()
	{ 
  System.out.println("method1 of the parent class is executed...");
	}
	public static void Method2()
	{
    System.out.println("method2 of the parent class is executed....");
	}
}

class MethodHiding extends Parent
{
	public static void Method1()
	{
   System.out.println("method1 of the child classs is executed......");
	}
	public static void Method2()
	{
   System.out.println("method2 of the child classs is executed......");
	}
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		//p2 is reference variable of class Parent that points to object of class MethodHiding
		Parent p2=new MethodHiding();
		//method calling with reference (method hiding)
		p1.Method1();
		p2.Method1();
		//method calling with object (method overriding)
		p1.Method2();
		p1.Method2();

	}
}
