//How to split a string in java with Delimiter
import java.util.Scanner;
class StringDelimiter 
{
	public static void main(String[] args) 
	{
		//declaring a string
		String str="java is the best language you should learn this language";
		//constructor of the Scanner class
		Scanner sc=new Scanner(str);
		while(sc.hasNext())
		{
     //invoking next() method that split the string
	 String tokens=sc.next();
	 //print the separateed tokens
          System.out.println(tokens);
		}
		
	}
}
