//program to sorting the array and min and max value of an array
class MinMaxArrayExample 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{3,2,1,1000,154};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
                  if(arr[i]<arr[j])
				{
					  temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				}
			}

		}
		System.out.println("Display the sorting array elements are as follows : ");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("minimum of an array : "+arr[0]);
		System.out.println("maximum of an array : "+arr[arr.length-1]);
	}
}
