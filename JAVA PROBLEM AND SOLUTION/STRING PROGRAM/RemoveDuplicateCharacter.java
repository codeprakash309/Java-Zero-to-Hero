//Remove Duplicate Character from the string
import java.util.Scanner;
class RemoveDuplicateCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  the string : ");
		String str=sc.nextLine();
		char[] s=str.toCharArray();
		int count=0;
		for(int i=0;i<=s.length-1;i++)
		{
			count=1;
           for(int j=i+1;j<=s.length-1;j++)
			{
            if(s[i]==s[j]&&s[i]!=' ')
				{
                count++;
				s[j]=' ';
				}
			}
			if(count<=1&&s[i]!=' ')
			{
               System.out.println(s[i]);
			}
		}
	}
}
