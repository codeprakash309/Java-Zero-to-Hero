class A
{
	A()
	{
      System.out.println("A classs Constructor.......");
	}
}
class B extends A
{
	B()
	{
   System.out.println("B class Constructor........");
	}
}
class ConstructorChain2 extends B 
{
	public static void main(String[] args) 
	{
		System.out.println("main method start......");
		ConstructorChain2 obj=new ConstructorChain2();
		System.out.println("main method end......");

	}
}
