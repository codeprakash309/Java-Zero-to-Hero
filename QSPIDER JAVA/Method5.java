class Method5 
{
	int x=5;
	public void M1(){
       System.out.println("M1 method");
	   int y=10;
	   y++;
	   System.out.println(y);
	}
	public void M2(){
 System.out.println("M2 method");
 int l=2;
 System.out.println(l);
	}
	public static void main(String[] args) 
	{
		Method5 obj= new Method5();
		obj.M1();
		obj.M2();
	}
}
