//write a program to capitalize the first character in the given string
import java.util.Scanner;
class  StringCapitalize
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		String word[]=str.split("\\s");
		String capitalizeWord="";
		for(String w:word)
		{
			 String first=w.substring(0,1);
	       String afterfirst=w.substring(1);
		    capitalizeWord=first.toUpperCase()+afterfirst+"";
			
		}
		System.out.println(capitalizeWord);
		

	}
}
