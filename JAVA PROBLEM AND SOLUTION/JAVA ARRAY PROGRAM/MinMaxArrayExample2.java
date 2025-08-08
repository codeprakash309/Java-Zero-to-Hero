import java.util.Scanner;
class  MinMaxArrayExample2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int num=sc.nextInt();
		System.out.println("Enter the array elemnts into a given size of an array : ");
		int arr[]=new int[num];
		int temp=0;
		//user input from console
		for(int i=0;i<num;i++)
		{
          arr[i]=sc.nextInt();
		}
		//this for loop is used for sorting the array elements
		for(int i=0;i<arr.length;i++)
		{
           for(int j=0;j<arr.length;j++)
			{
            if(arr[i]<arr[j])   //< less than means assending order if > greater than   desending order sorting
				{
                 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				}
			}
		}
		System.out.println("display an array element are : ");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}

		System.out.println("___________________________________");
		System.out.println("min value of an array : "+arr[0]);
		System.out.println("max value of an array : "+arr[arr.length-1]);
	}
}
