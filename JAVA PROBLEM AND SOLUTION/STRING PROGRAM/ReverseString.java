//how to reverse of a String in java
import java.util.Scanner;
class  ReverseString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.next();  //single word taken in this line
		char ch[]=str.toCharArray();  //converts string to charArray
		System.out.print("Reverse of the String is : ");
		for(int i=ch.length-1;i>=0;i--)
		{
		System.out.print(ch[i]+"");
		}
		System.out.println();
	}
}
