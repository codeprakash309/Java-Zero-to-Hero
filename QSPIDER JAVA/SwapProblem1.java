class SwapProblem1
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		b=b+a;
		//now b is sum of both the numbers
		a=b-a;
		//b-a=(b+a)-a=b(a is swaped)
		b=b-a;
		//(b+a)-b=a(b is swaped)
		System.out.println(a);
		System.out.println(b);
	}
}
