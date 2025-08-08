class Method8 
{
	int z=2;
	public void M1(boolean b, float f)
	{

System.out.println("boolean-float method");
System.out.println(b);
System.out.println(f);
System.out.println(z);
	}
	public void M2(int p)
	{
System.out.println("int  method");
M1(true,'a');
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		Method8 obj= new Method8();
		obj.M2('a');
	}
}
