class ReverseString 
{
	public static String reverse(String str)
	{
     char []ch=str.toCharArray(); //string is converting to character array
	 String rev="";
	 for(int i=ch.length-1;i>=0;i--)
		{
          rev=rev+ch[i];
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		System.out.println("string before :  "+ "nitin");
		System.out.println("reverse string is : "+reverse("nitin"));
		System.out.println("***************palindrom string checking****************");
		String s="nitin";
		String t=reverse("nitin");
		if(s.equals(t))
		System.out.println("palindrom string");
		else
			System.out.println("not pallindrom string");
	}
}
