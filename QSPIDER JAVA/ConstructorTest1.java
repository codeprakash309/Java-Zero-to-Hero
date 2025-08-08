class parent
{
	parent()
	{
    System.out.println("parent class constructor.......");
	}
}
class ConstructorTest1
{
	ConstructorTest1()
	{
    System.out.println("child class constructor.....");     
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConstructorTest1 obj=new ConstructorTest1();
		System.out.println("main method end");
	}
}
