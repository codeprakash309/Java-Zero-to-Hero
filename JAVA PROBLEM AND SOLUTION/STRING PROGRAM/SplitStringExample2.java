class SplitStringExample2 
{
	public static void main(String[] args) 
	{
		//defining a string object
		String s ="if you don't like something, change.it.";
		//split string by multiple delimiters
		String[]  str=s.split("[,.']+");   //we can use dot,whitespace,any character 
		//iterate over string array
		for(int i=0;i<str.length;i++)
		{
       //prints the tokens
	   System.out.println(str[i]);
		}
	}
}
