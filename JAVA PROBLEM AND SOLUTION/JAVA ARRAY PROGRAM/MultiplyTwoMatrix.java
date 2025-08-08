//write a program to multiply of two matrixes
import java.util.Scanner;
class MultiplyTwoMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row for matrix1 : ");
		int M1row=sc.nextInt();
		System.out.println("Enter the column for matrix1 : ");
		int M1col=sc.nextInt();
		System.out.println("Enter the first matrix : ");
		int M1[][]=new int[M1row][M1col];   //first array
		for(int i=0;i<M1row;i++)
		{ 
			for(int j=0;j<M1col;j++)
			{
            M1[i][j]=sc.nextInt();
		    }
			
		}
		System.out.println("Enter the row for matrix2 : ");
		int M2row=sc.nextInt();
		System.out.println("Enter the column for matrix2 : ");
		int M2col=sc.nextInt();
		if(M1col!=M2col)
		{
         System.out.println("first matrix and second matrix number of column should be same otherwise you cant'n perform multiplication operation  ");
		}
		else
		{
		System.out.println("Enter the second matrix : ");
		int M2[][]=new int[M2row][M2col];   //second array 
		for(int i=0;i<M2row;i++)
		{
			for(int j=0;j<M2col;j++)
			{
            M2[i][j]=sc.nextInt();
			}
		}
		//logic for adding two matrix
		int sum=0;
		int multiply[][]=new int[M1row][M2col];  //this 2d array is taken for store after multyply value inside it
		for(int i=0;i<M1row;i++)
		{
			for(int j=0;j<M2col;j++)
			{
				for(int k=0;k<M2row;k++)
				{
                 sum=sum+M1[i][k]*M2[k][j];
				}
				multiply[i][j]=sum;
				sum=0;
			}
   		}
		
		System.out.println("Product of two matrixes : ");
       for(int i=0;i<M1row;i++)
		{
			for(int j=0;j<M2col;j++)
			{
             System.out.println( multiply[i][j]+"\t");
			}
			 System.out.print("\n");
   		}
		}
	}
}
