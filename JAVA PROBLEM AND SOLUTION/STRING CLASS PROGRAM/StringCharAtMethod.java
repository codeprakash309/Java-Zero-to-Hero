//the string class charAt() method returns a character at specified index.
class  StringCharAtMethod
{
	public static void main(String[] args) 
	{
		String s="abcdefghijklmnopqrstuvwxyz";
		System.out.println("charAt(0) position placed character is : "+s.charAt(0));
		System.out.println("last character in  the string is : "+s.charAt((s.length()-1)));
		for(int i=0;i<s.length();i++)
		{
            if(s.charAt(i)%2!=0)
			{
                 System.out.println(s.charAt(i));
			}
		}
	}
}
