import java.util.Scanner;
class  XYZ
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		int len=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(ch[i]==' ')
			{
             System.out.println();
			}
			else 
				System.out.print(ch[i]);
		}
		System.out.println();

		sc.close();
	}
}
