class Test 
{
	static int x=10;
	static
	{
      M1();
	 System.out.println("FSB");	
	}
	public static void main(String[] args) 
	{
		M1();
		System.out.println("main method");
	}
	public static void M1()
	{
   System.out.println(j);
	}
	static
	{
      System.out.println("SSB");
	}
	static int j=20;
}
