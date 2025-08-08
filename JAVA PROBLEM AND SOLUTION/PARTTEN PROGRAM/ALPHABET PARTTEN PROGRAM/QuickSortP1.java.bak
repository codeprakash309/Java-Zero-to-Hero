class QuickSortP1
{
	static int partition(int [] arr,int low , int high)
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
	static void quickrecursion(int[] arr,int low,int high)
	{
		int pi=partition(arr,low,high);
		if(low<pi-1)
		{
        quickrecursion(arr,low,pi-1);
		}
		if(pi<high)
		{
         quickrecursion(arr,pi,high);
		}

	}
	static void printArray(int[] arr)
	{
       for(int i:arr)
		{ 
		   System.out.print(i+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=new int[]{10,2,8,4,7,3,9,6,5,1};
		int len=arr.length;
		System.out.println("Array before quick sort");
		printArray(arr);
		System.out.println("\n Array After quick sort");
		quickrecursion(arr,0,len-1);
		printArray(arr);
		System.out.println();

	}
}
