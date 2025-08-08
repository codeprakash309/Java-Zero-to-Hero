class  OverloadingCase3
{
	public void M1(String s)
	{
    System.out.println("String arg method....");
	}
	public void  M1(StringBuffer sb)
	{
    System.out.println("StringBuffer arg method.....");
	}
	public static void main(String[] args) 
	{
		OverloadingCase3 obj =new OverloadingCase3();
		obj.M1("abc");
		obj.M1(new String());
		obj.M1(new StringBuffer());
		//obj.M1(null);  //error: reference to M1 is ambiguous    obj.M1(null);
	}
}
