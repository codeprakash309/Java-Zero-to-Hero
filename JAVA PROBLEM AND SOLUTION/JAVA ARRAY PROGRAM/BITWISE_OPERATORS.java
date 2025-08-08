import  java.util.Scanner;
class BITWISE_OPERATORS 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of (a) : ");
		int a=sc.nextInt();
		System.out.print("Enter the value of (b) : ");
		int b=sc.nextInt();
		System.out.print("Enter the value of (c) : ");
		int c=sc.nextInt();
		System.out.println(a^b);
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(~a);
		System.out.println(c|(a^a));
	}
}
