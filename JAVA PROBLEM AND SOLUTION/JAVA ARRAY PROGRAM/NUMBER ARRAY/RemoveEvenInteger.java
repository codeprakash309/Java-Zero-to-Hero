import java.util.Scanner;
class RemoveEvenInteger 
{
	public static int[] removeEven(int[] arr)
	{
          int oddCount=0;
		  for(int i=0;i<arr.length;i++)
		{
            if(arr[i]%2!=0)
			     oddCount++;
		}
		int[] result=new int[oddCount];
		int idx=0;
		for(int i=0;i<arr.length;i++)
		{
           if(arr[i]%2!=0)
			{
             result[idx]=arr[i];
			 idx++;
			}
		}  
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element you want to enter : ");
		int n=sc.nextInt();
		System.out.print("Enter the  Numbers : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=sc.nextInt();
		}
		int[] result=removeEven(arr);
		for(int i:result)
			System.out.print(i+",");
	}
}
