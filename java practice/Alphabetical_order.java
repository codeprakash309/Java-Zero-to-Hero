import java.util.Scanner;                //program to print the given string in sorted order
class Alphabetical_order 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of  names you want to enter : ");
		int n=sc.nextInt();
		String[] names=new String[n];
		System.out.println("Enter all the names : ");
		for(int i=0;i<n;i++)
		{
           names[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
          for(int j=i+1;j<n;j++)
			{
              if(names[i].compareTo(names[j])>0)       
				{
                String temp=names[i];
				names[i]=names[j];
				names[j]=temp;
				}
			}
		}
		System.out.println("Names in Sorted Order   :  ");
		for(int i=0;i<n-1;i++)
		{
        System.out.print(names[i]+",");
		}
		System.out.println(names[n-1]);
	}
}
