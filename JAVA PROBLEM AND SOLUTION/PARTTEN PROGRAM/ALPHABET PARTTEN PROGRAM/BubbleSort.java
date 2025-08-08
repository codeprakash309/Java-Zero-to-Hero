class BubbleSort 
{
	static void bubblesort(int[] arr)
	{
      int n=arr.length;
	  int temp=0;
	  for(int i=0;i<n;i++)
		{
          for(int j=1;j<n-i;j++)
			{
                  if(arr[j-1]>arr[j])
				{
                 //swap elements
				 temp=arr[j-1];
				 arr[j-1]=arr[j];
                 arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] a=new int[]{3,60,35,2,45,320,5};
		System.out.println("Array Before Bubble sort ");
		for(int i=0;i<a.length;i++)
		{
          System.out.print(a[i]+" ");
		}
		  System.out.println();
		  bubblesort(a);
		  System.out.println("Array after Bubble sort");
		  for(int i=0;i<a.length;i++)
		{
          System.out.print(a[i]+" ");
		}
	}
}
