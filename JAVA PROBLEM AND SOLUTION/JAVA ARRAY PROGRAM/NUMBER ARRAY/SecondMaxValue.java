import java.util.Scanner;
class SecondMaxValue
{
	public static int findSecondMax(int[] arr)
	{
       int max=0;
	   int secondMax=0;
	   for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]>max)
			{
                  secondMax=max;
				  max=arr[i];
			}else if(arr[i]>secondMax &&  arr[i]!=max)
			{
            secondMax=arr[i];
			}
		}	   
	   return secondMax;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of  elements you want to Enter : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
		{
            arr[i]=sc.nextInt();
		}
		int max=findSecondMax(arr);
       System.out.print("Second  maximunm value is  : "+max);
	   System.out.println();
	}
}
