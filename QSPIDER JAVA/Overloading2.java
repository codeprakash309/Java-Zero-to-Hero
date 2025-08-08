class Overloading2 
{
	public void M1(int i, float f)
	{
       System.out.println("Hiii....");
	}
	public void M1(float f, int i)
	{
     System.out.println("bye");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method starts.....");
        Overloading2  obj=new Overloading2 ();
		obj.M1(10,10.5f);
        obj.M1(10.5f,10);
		//obj.M1(10,10);
		//obj.M1(10.5f,10.5f);
		System.out.println("main method starts.....");
	}
}
