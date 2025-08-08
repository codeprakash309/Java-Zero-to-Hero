class ParaConstructorTest
{
  ParaConstructorTest(int x, int y)
	{
int z=x+y;
System.out.println("value of X : "+x);
System.out.println("value of Y : "+y);
System.out.println("Sum of two number is : "+z);

	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		ParaConstructorTest obj = new  ParaConstructorTest(12,30);
		System.out.println("main end");
	}
}
