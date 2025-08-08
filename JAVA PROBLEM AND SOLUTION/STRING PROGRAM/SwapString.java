//write a  program to swap two string variables without using a third  variable in java
class  SwapString
{
	public static void main(String[] args) 
	{
		String a="good";
		String b="morning";
		System.out.println("***************BEFORE SWAP*********************"+"\n"+"a = "+a+"\n"+"b = "+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("*******************AFTER SWAP****************** "+"\n"+"a = "+a+"\n"+"b = "+b);
	}
}
