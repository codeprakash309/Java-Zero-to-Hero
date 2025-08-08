class ArrayProblem1 
{
	public static void main(String[] args) 
	{
		int arr[]={3,5,1,9,6,7};
		int min,max;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
            if(arr[i]<=arr[j])
				System.out.println(arr[i]);
		}
		}
		System.out.println("Hello World!");
	}
}
