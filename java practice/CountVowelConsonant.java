class  CountVowelConsonant
{
	public static void main(String[] args) 
	{
		int vCount=0,cCount=0;
		//declaring a string
		String str="this is a really simple sentence";
		//converting entire string to lower case to reduce the comparisions
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
         //checks whether a character is a vowel
		 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
         //increment the vowel counter
		  vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
             //increments the consonant counter
			 cCount++;
			}
		}
		System.out.println("Number of vowels : "+vCount);
		System.out.println("Number of consonant : "+cCount);
	}
}
