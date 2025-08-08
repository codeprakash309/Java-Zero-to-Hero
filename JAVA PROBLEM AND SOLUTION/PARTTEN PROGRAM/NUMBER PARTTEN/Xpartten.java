// X partten with number
import java.util.Scanner;
class  Xpartten
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row and column : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
              if(i==j||i+j==n+1)
				{
                    System.out.print(i);
				}
				else
				{
                System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
