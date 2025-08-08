class QuickSort 
{
	public static int partition(int[] arr,int low, int high)
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
			}
		}
		return low;
	}
	public static void quicksortRecursion(int []arr,int low,int high)
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
	public static void printArray(int[] arr)
	{
       for(int i:arr)
		   System.out.print(i+" ");
	}
	public static void main(String[] args) 
	{
		int [] arr=new int[]{12,5,1,9,6,7,10,3,2,4,8,11};
		int len=arr.length;
		System.out.println("Array Before Quick sort : ");
		printArray(arr);
		System.out.println("\nArray After Quick Sort : ");
		quicksortRecursion(arr,0,len-1);
		printArray(arr);
		System.out.println();
	}
}
