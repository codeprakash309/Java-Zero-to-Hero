//write a program to add two matrixes
import java.util.Scanner;
class AddTwoMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of the matrix : ");
		int row=sc.nextInt();
		System.out.println("Enter the column of matrix : ");
		int col=sc.nextInt();
		System.out.println("Enter the first matrix : ");
		int M1[][]=new int[row][col];   //first array
		for(int i=0;i<row;i++)
		{ 
			for(int j=0;j<col;j++)
			{
            M1[i][j]=sc.nextInt();
		    }
			
		}
		System.out.println("Enter the second matrix : ");
		int M2[][]=new int[row][col];   //second array 
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
            M2[i][j]=sc.nextInt();
			}
		}
		//logic for adding two matrix
		int sum[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
              sum[i][j]=M1[i][j]+M2[i][j];
			}
   		}
		System.out.println("Sum of two matrixes : ");
       for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
             System.out.println( sum[i][j]);
			}
   		}
	}
}
