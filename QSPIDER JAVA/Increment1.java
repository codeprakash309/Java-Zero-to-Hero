class Increment1 
{
	public static void main(String[] args) 
	{ 
		int x=9;
		int y=++x+x-- + ++x+ --x+ --x+ ++x ;
		System.out.println("Value of X is : "+x);
		System.out.println("Value of Y is : "+y);
	}
}
