//find the largest and smallest number in an array and make it dynamic
import java.util.Scanner;
class  DuplicateArrayElement
{
	public static void main(String[] args)  
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size=sc.nextInt();
		System.out.println("Enter the array  elements  into an Array : ");
		int [] arr=new int[size];
		int temp;
		for(int i=0;i<size;i++)
		{
               arr[i]=sc.nextInt();
		}
		//logic for sorting in the assending order 
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1;j<size;j++)
			if(arr[i]==arr[j])
			{
            arr[i]=arr[j];
			count++;
			}			
        }
		System.out.println("duplicate elements are : "+count);
		for(int i=0;i<arr.length;i++)
		{
             System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("smallest element in the given array is : "+arr[0]); //first element in an array
		System.out.println("largest element in the given array  is  : "+arr[arr.length-1]);		//last element in an array
		}
}
