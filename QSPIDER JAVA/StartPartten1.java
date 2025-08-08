import java.util.Scanner;
class StartPartten1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the n row and column : ");
		int n=scn.nextInt();
		for(int i=0;i<n;i++ ){
			for(int j=i;j<n;j++)
		{
				if(i==j||i>j)
		System.out.print("A");
				else
					System.out.print("B");
		}
		System.out.println();
		}
	}
}
