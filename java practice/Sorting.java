class Sorting 
{
	public static void main(String[] args) 
	{
		int temp=0;
		int []arr={1,9,5,10,8,7,2,4,6,3};
		System.out.println("before sorting array elements are : ");
		for(int i=0;i<arr.length;i++)
			{
		System.out.print(" "+arr[i]);
			}
			System.out.println();
			System.out.println("after sorting array elements are : ");
			for(int i=0;i<arr.length;i++)
		{
				for(int j=0;j<arr.length;j++){
                   if(arr[i]<arr[j])
					{
                    temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
}
