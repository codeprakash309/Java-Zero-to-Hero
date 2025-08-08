//write a program to find the middle character(for even character) of the given string 

import java.util.Scanner;
public class MiddleCharacterString {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);	
     System.out.print("Enter the string : ");
     String s=scn.nextLine();
     if(s.length()%2==0)
     {
    	 String s1=getMiddleChar(s);
    	 System.out.println(s1);
     }
	}
	public static String getMiddleChar(String str)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(str.subSequence(str.length()/2-1, str.length()/2+1));
		String s2=sb.toString();
		return s2;
	}

}
