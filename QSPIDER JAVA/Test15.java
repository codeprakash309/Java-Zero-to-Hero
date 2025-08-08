class Test14
{
	public void M1(String s)
	{
      System.out.println("non-primitive date type.......");
	}
	public void M1(int x)
	{
  System.out.println("Primitive data type.......");
	}
	public static void main(String[] args) 
	{
		Test14 obj= new Test14();
		obj.M1("abc");
		
	}
}
