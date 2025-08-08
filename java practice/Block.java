class  Block
{
	static
	{
    System.out.println("FSB");
	}
	{
		M1();
    System.out.println("FIB");
	}
	Block()
	{
    System.out.println("constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start....");
		Block obj=new Block();
		System.out.println("main end.....");
	}
  public void M1()
	{
    System.out.println("non static method");
	}
	{
      System.out.println("SIB");
	}
	static
	{
    System.out.println("SSB");
	}
}
