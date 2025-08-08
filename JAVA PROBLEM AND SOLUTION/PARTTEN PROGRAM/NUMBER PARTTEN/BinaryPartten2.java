import java.util.Scanner;
class BinaryPartten2
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
               for(int j=0;j<=i;j++)
			{
                 if(j%2==0)
				{
                  System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
