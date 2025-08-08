import java.util.Scanner;
class StringArray1      //linear search
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1=sc.nextLine();
		int count=0;
		char[] ch=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			count=1;
           for(int j=i+1;j<=ch.length-1;j++)
			{
             if(ch[i]==ch[j]&&ch[i]!=' ')
				{
                count++;
				ch[j]=' ';
				}
			}
			if(count>1)
			{
             System.out.println(ch[i]);
			}
		}
	}
}
