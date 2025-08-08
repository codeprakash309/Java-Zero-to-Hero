class QuickSort 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{15,9,7,13,12,16,4,18,11};
		int len=arr.length;
		System.out.println("Array Before Quick sort ");
		printArray(arr);
		System.out.println("\nArray After Quick sort ");
		quicksortRecursion(arr,0,len-1);  //array index start from 0 and end with n-1
		printArray(arr);
		System.out.println();
	}
	static int partition(int[] arr,int low,int high)
	{
         int pivot=arr[(low+high)/2];
			 while(low<=high)
		{
            while(arr[low]<pivot)
			{
                low++;
			}
			while(arr[high]>pivot)
			{
             high--;
			}
			if(low<=high)
			{
           int temp=arr[low];
		   arr[low]=arr[high];
		   arr[high]=temp;
		   low++;
		   high--;
			}
		}
		return low;
	}
	static void quicksortRecursion(int[] arr,int low,int high)    //low means 1st index and high means last index
	{
     int pi=partition(arr,low,high);
	 if(low<pi-1)
		{
         quicksortRecursion(arr,low,pi-1);
		}
		if(pi<high)
		{
          quicksortRecursion(arr,pi,high);
		}
	}
	static void printArray(int[] arr)
	{
       for(int i:arr)
		{ 
		   System.out.print(i+" ");
		}
	}
}
