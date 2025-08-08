//write a java program to sum values of an array
import java.util.Scanner;
class  ArraySum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array  : ");
		int n=sc.nextInt();
		System.out.println("Enter the array elemnts into an array : ");
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
            arr[i]=sc.nextInt();
		}
		//logic for sum of array
		for(int i=0;i<arr.length;i++)
		{
          sum=sum+arr[i];
		}
		System.out.println("Sum of array elements are : "+sum);
	}
}
