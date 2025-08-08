class Student
{
}
class Customer
{
}
class InstanceMethod 
{
	public static void main(String[] args) throws Exception
	{
		Object o=Class.forName(args[0]).newInstance();
		System.out.println("object created for "+o.getClass().getName());
	}
}
