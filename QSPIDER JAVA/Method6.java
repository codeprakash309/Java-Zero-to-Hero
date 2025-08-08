class Method6 
{
	static int x=2;
	public static void main(String[] args) 
	{
		System.out.println("main method starts ....");
		Method6 obj=new Method6();
		obj.M1();
		System.out.println("program terminate");
		System.out.println(x);
	}
	public void M1(){
  M2();
  System.out.println("m1 method");
  int z='a';
  z+=2;
  System.out.println(z);
	}
	public void M2(){

System.out.println("m2 method");
System.out.println("exit");
	}
}
