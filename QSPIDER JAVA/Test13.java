class Test13
{
	public static void M1(String s)
	{
       System.out.println("hii........");  
	}
	public static void main(String[] args) 
	{
		
		M1("abc");          //we can directly call static method  
		M1(null);
		M1(new String());
	}
}
