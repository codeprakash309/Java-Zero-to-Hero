class Test11 
{   
	int x=10;
	public static void main(String[] args) 
	{
		Test11  t1=new Test11();
		Test11  t2=new Test11();
		System.out.println(t1.x);
		System.out.println(t2.x);
		t1.x=100;
		t2.x=200;

		System.out.println(t1.x);
		System.out.println(t2.x);
	}
}
