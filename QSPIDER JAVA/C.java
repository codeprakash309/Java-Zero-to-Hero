class P
{
     public void M1()
	{
   System.out.println("Parent class");
	}
}
class C extends P
{
	public void M2()
	{
    System.out.println("child class");
	}
	public static void main(String[] args) 
	{
    	C c=new C();
		c.M1();
		c.M2();
		((P)c).M1();
		//((P)c).M2();	
	
	}
}
