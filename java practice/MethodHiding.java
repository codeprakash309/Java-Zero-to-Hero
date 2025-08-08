class Parent
{
	public static void M1()
	{
      System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	public static void M1()
	{
	System.out.println("Child class method");
	}
}

class MethodHiding 
{
	public static void main(String[] args) 
	{
		Parent p=new Child();
		p.M1();  //method resolution is based on reference type
	}
}
