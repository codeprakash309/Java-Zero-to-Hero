//write a program to print character in alphabetical order
import java.util.Scanner;
class CharArrayInDesndingOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the char array : ");
		int n=sc.nextInt();
		char ch[]=new char[n];
		System.out.println("Enter the  Character : ");
		for(int i=0;i<ch.length;i++)
		{
           ch[i]=sc.next().charAt(0);
		}
		//sorting the character in alphabetical order
		for(int i=0;i<ch.length;i++)
		{
               for(int j=i+1;j<ch.length-1;j++)
			{
              if(ch[i]<ch[j])
				{
                 char temp=ch[i];
				 ch[i]=ch[j];
				 ch[j]=temp;
				}  //if ends
			}  //inner loop ends
		}   //outer loop ends
		System.out.println("character are in the alphabetical order : ");
		for(int i=0;i<ch.length;i++)
		{
         System.out.print(ch[i]+" , ");
		}
		System.out.println();
	}
}
