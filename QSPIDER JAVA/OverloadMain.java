class OverloadMain 
{
	public static void main(int a) 
	{
		System.out.println("int arg main method");
	}

	public static void main(float f) 
	{
		System.out.println("float arg main method");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start..................");
		main(12);
		main(15.5f);
	}
}
