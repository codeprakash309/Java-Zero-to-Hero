class  programNonStatic
{
	public void A(int x)
	{
 System.out.println(x);
 System.out.println("abc");

	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		programNonStatic obj= new programNonStatic();
		obj.A(45);
	}
}
