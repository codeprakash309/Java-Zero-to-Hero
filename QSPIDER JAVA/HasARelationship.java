class A
{
	int x=10;
	int y=20;
	int sum=0;
	public void M1()
	{
     sum=x+y;
	 System.out.println("x+y  is  : "+sum);
	}
}
class B
{
	int a=50;
	int b=10;
	int sub;
	public void M2()
	{
		sub=a-b;
  System.out.println("a-b  is : "+sub);
	}
}


class HasARelationship 
{
	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		A obj= new A();
		System.out.println("value of x : "+obj.x);
		System.out.println("value of y : "+obj.y);
		obj.M1();
		B b=new B();
		System.out.println("value of a "+b.a);
		System.out.println("value of b "+b.b);
		b.M2();
		System.out.println("main method ends");
	}
}
