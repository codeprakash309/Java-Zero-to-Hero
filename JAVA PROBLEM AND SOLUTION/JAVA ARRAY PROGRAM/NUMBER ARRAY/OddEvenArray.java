class OddEvenArray 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.print("Array Elements are :   ");
		for(int i=0;i<arr.length;i++)
		{
             System.out.print(arr[i]+","); 
		}
		System.out.println();
		OddEvenSubArray(arr);			
	}
	public static void OddEvenSubArray(int[] a)
	{
		int[]  arr=new int[a.length];
		int index=0;
         //add all the  even number to resultant array
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
            arr[index]=a[i];
			index++;
			}			
		}
		//add all the  odd number to resultant array
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
            arr[index]=a[i];
			index++;
			}			
		}
		System.out.print("Resultant Even and Odd Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
