//find the character from the string at specified position
import java.util.Scanner;
class FindCharacterInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String  :  ");
		String str1=sc.nextLine();
		char[] str2=str1.toCharArray();
		System.out.print("Enter the charcter  : ");
		char ch=sc.next().charAt(0);
	    int count=0;
		for(int i=0;i<str2.length;i++)
		{
			count++;
        if(str2[i]==ch)
			{
			    System.out.print(ch+" found at position "+count);
			}
		}
		System.out.println();
	}
}
