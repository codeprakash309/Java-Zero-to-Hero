class TestOperator 
{
	String name;
	TestOperator(String name)
	{
  this.name=name;
	}
	public static void main(String[] args) 
	{
		int x=10;
		int y=10;
		TestOperator t=new TestOperator("guddu");
		TestOperator t1=new TestOperator("guddu");
		System.out.println(x==y);
		System.out.println(t==t1);
	}
}
