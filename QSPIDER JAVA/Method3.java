class Method3 
{
	static int x=10;
	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		Method3 obj=new Method3();
		obj.M1(); //here  executed 
	}
	public void M1()
	{
    System.out.println(x);    //here only memory address is copied and display the output or u can say we can accessing the variable
	}
}
