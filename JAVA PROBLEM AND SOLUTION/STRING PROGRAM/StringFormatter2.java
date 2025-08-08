class StringFormatter2 
{
	public static String reverseWord(String str)
	{
       String[]  words=str.split("\\s");
	   String reverseWord="";
	   for(String w:words)
		{
       StringBuilder sb=new StringBuilder(w);
	   sb.reverse();
	   reverseWord+=sb.toString()+" ";
		}
		return reverseWord.trim();
	}
	public static void main(String[] args) 
	{
		System.out.println(reverseWord("nil nitin mukesh"));
		System.out.println(reverseWord("he is a handome guys"));
	}
}
