class Array1DadditionExample 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,2,3,4};
		System.out.println("length of the array is  : "+arr.length);
		System.out.println("Display the array element are : ");
		for(int i=0;i<arr.length;i++)
		{
           System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("adding 5 into the given 1d array");
		for(int i=0;i<arr.length;i++)
		{
            arr[i]=arr[i]+5;
		 System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
