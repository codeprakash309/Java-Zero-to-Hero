import java.util.Scanner;
class StringReverse1 
{
	//reverse the letter of the word
	public static void reverse(char[] str,int start, int end)
	{
       char temp;
	   while(start<=end)
		{
        //swapping the first and last character
		temp=str[start];
		str[start]=str[end];
		str[end]=temp;
		start++;
		end--;
		}
	}
	//function to reverse words
	public static char[] reverseWord(char[] s)
	{
  //reversing individuals words as explained in the first step
  int start=0;
  for(int end=0;end<s.length;end++)
		{
          //if we see a aspace ,we reverse the previous word (word between the indexes start and end-1)  i.e.  s[start.. end-1]
		  if(s[end]==' ')
			{
           reverse(s,start,end);
		   start =end+1;
			}
		}
		//Reverse the last word
	    reverse(s,start,s.length-1);
	//reverse the entire String
	    reverse(s,0,s.length-1);
	    return s;			
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		char[] p=reverseWord(str.toCharArray());
		System.out.print(p);
		System.out.println();
	}
}
