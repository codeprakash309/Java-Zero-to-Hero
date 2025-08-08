class  Method
{
	int x=10;
	public void Demo1()
	{
     System.out.println("I am inside the demo1 method...");
	 System.out.println(x);

	}
	public void Demo2(int x){
  System.out.println("i am inside the Demo2 method....");
  System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Method obj = new Method();
		obj.Demo1();
		obj.Demo2(120);
	}
}
