class ExtractChar 
{
	public static void main(String[] args) 
	{
		String s="prakash";
		System.out.println(s.charAt(0));  //first character of the string
		char str=s.charAt((s.length()-1)/2); //middle charater of the string
		System.out.println(str);
		System.out.println(s.charAt(s.length()-1)); //last character of the string
	}
}
