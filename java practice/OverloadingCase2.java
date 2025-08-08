class OverloadingCase2
{
	public void M1(Object o)
	{
   System.out.println("Object arg method.....");
	}
	public void M1(String s)
	{
   System.out.println("String arg method.....");
	}
	public static void main(String[] args) 
	{
		OverloadingCase2 obj =new OverloadingCase2();
		obj.M1("abc");
		obj.M1(new Object());  //here also exact match with object classs
		obj.M1(new String());  //here exact mathced found so that it will go to that method only
		obj.M1(null);  //null is default value of non-primitive data type.  there is any relation between two the class.then always priority goes to child class only 
	}
}
