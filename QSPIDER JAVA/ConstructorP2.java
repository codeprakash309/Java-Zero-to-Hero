class ConstructorP2
{
	ConstructorP2()
	{
         System.out.println("i am inside the constructor...");
	}
}
class Constructor1 extends ConstructorP2
{
	public static void main(String[] args) 
	{
		ConstructorP2 obj=new ConstructorP2();
	}
}
