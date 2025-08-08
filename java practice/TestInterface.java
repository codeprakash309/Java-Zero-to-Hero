interface test
{
int x=10;    //inside an interface variable must be initialize otherwise get compile time error 
public void M1();
}
class TestInterface implements test
{
	public void M1()
	{
     System.out.println("value of x = "+x);
	}
	public static void main(String[] args) 
	{
		TestInterface t=new TestInterface();
		t.M1();
	}
}
