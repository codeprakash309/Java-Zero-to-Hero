class CountCharacter 
{
	public static void main(String[] args) 
	{
		String string="the best of both worlds";
		int count=0;
		//counts each character except space
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
				count++;
    	}
		System.out.println("Total number of character in a string: "+count);
	}
}
