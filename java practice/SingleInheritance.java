class PParent
{
	public void M1()
	{
		System.out.println("parent's class method");
	}
}
class CChild extends PParent
{
	public void M2()
	{
		System.out.println("child's classa method");
	}
}
class SingleInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		CChild c= new CChild();
		c.M1();
		c.M2();
		System.out.println("**********************************");
		PParent p=new CChild();
		p.M1();
		//p.M2(); // compile time error, saying can not find symbol
	}
}
