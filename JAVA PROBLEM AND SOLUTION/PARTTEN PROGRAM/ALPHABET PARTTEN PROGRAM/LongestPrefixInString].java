import java.util.*;
class LongestPrefixInString
{
	public static String longestCommonPrefix(String[] a)
	{
     int size=a.length;
	 //if size is 0, return empty string
	 if(size==0)
		 return " ";
	 if(size==1)
		 return a[0];
	 //sort the array of string
	 Arrays.sort(a);
	 //find the minimum lengthfrom first and last String
	 int end=Math.min(a[0].length(),a[size-1].length());
	 //find the common prefix between the first and alst string
	 int i=0;
	 while(i<end&&a[0].charAt(i)==a[size-1].charAt(i))
		{
		 i++;
		}
	 String pre=a[0].substring(0,i);
	 return pre;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number  of String :  ");
		int n=sc.nextInt();
		String[] input=new String[n];
		System.out.print("Enter your String here   :  ");
		for(int i=0;i<n;i++){
		input[i]=sc.next();
		}
	}
}
