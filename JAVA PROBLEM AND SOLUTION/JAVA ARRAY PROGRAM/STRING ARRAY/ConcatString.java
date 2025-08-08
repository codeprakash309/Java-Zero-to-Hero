class ConcatString 
{
	public static void main(String[] args) 
	{
		String[] str=new String[]{"salman","sarukh","akhyakumar","Ritik"};
		System.out.println("String Elements are : ");
		String str1="";
		for(int i=0;i<str.length;i++)
		{
          System.out.println(str[i]);
		  str1=str1+str[i];
		}
		System.out.print(str1);
		System.out.println();
	}
}
