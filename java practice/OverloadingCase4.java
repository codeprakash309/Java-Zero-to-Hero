class  OverloadingCase4
{
	public void M1(int i)
	{
System.out.println("normal int arg method....");
	}
	public void M1(int  ...k)
	{
System.out.println("variable arg method.....");
	}
	public static void main(String[] args) 
	{
		OverloadingCase4 obj =new OverloadingCase4();
		obj.M1();
		obj.M1(10);
		obj.M1(10,20);
		obj.M1(10,20,30);
	}
}
