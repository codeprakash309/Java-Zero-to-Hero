//Reena wanats  to buy n gifts for her husband and store it in a bag. the cost of each gift is enterd by the user.
//Create a program to find the amount she spent to buy the gifts for her husband
import java.util.Scanner;
class  SumOfArrayElements
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements into an array : ");
		int size=sc.nextInt();
		int arr[]=new int [size];
		int sum=0;
		System.out.println("Enter the  array elements  : ");
			for(int i=0;i<size;i++)
		{
                arr[i]=sc.nextInt();
		}
		//logic for sum of array elements
		for(int i=0;i<arr.length;i++)
		{
         sum=sum+arr[i]; //or sum+=arr[i]      featch eatch element from array and added 
		}
		System.out.println("Sum of array elements are : "+sum);
	}
}
