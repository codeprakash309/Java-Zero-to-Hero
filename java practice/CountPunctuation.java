class  CountPunctuation
{
	public static void main(String[] args) 
	{
		int count=0;
		String str="he said, 'the mailman loves you.' i heard it with my own ears.";
		for(int i=0;i<str.length();i++)
		{
			//check wheather given character is punctuation mark
			if(str.charAt(i)=='!'|| str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='"'||str.charAt(i)==':')
			{
             count++;
			}
		}
		System.out.println("the number of punctuation exists in the string is : "+count);
}
}
