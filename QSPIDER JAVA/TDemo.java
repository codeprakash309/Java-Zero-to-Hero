class TDemo 
{
	int x=10;        //non-static variable
	static int y=15;      //static variable
	public void M1()
	{
    int y=12;      //local variable
   System.out.println("inside M1 method......");
   System.out.println(y);
   System.out.println(new TDemo().y);   //new TDemo() is an object
	}
	public void M1(Object o)        //object is the supermost class of every java classes
	{
System.out.println("inside the M1 method....");
System.out.println(o);
	}
	public void M2(int l,String s)                  //String is a pre-defined classs
	{
     System.out.println("inside the M2 method");
     System.out.println(l);
    System.out.println(s);
	 System.out.println("static variable : "+new TDemo().y);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method starts");
       TDemo obj = new TDemo();
	   obj.M1();
	   obj.M1(new String("Hello"));
	   obj.M2(18,"prakash");
	   System.out.println("static variable : "+y);
	}
}
