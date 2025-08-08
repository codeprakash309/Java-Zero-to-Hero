class Method11 
{
	public void M2(int x, Object o)
	{

System.out.println(x);
System.out.println(o);
System.out.println("exit");
	}
	public void M3(String s, double d)
	{

System.out.println(s);
System.out.println(d);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method starts");
     Method11  obj= new Method11 ();
	 obj.M2(10,null);
	 obj.M3(null,'a');
	}
}
