//how to remove whitespace from a string
import java.util.Scanner;
class WhiteSpaceRemove 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
        char ch=str.charAt(i);
		if(ch!=' ')
			System.out.print(ch);
		}
		System.out.println();
	}
}
