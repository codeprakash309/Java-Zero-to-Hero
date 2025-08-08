class Parent
{
	public void M1()
	{
          System.out.println("Parent class method......");
	}
}
class Child extends Parent
{
	
	public void M1()
	{
		super.M1();
           System.out.println("Child class method.......");
	}
}
class SuperKeyword 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.M1();		
	}
}
