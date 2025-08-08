class TestStatic
{    
	//private int num=0;  it is a non-static variable 
	private static int num=0;
	public static void main(String[] args) 
	{
		num++;                             //if we want to increment the non-static variable then it will give an error and also we can not access a non-static variable inside a static variable 
		System.out.println("Number is incremented by "+num);
	}
}
