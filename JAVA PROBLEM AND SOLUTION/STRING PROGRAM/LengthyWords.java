//java program to find the largest and smallest word in a string
class LengthyWords 
{
	public static void main(String[] args) 
	{
		String str="hardships often prepare ordinary people for an extraordinary destiny";
		String word="",small="",large="";
		String[] WordsArray=new String[100];
		int len=0;
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
         if(str.charAt(i)!=' ')
			{
              word=word+str.charAt(i);
			}
			else
			{
             WordsArray[len]=word;
			 len++;
			 word="";
			}
		}
		small=large=WordsArray[0];
		for(int k=0;k<len;k++)
		{
          if(small.length()>WordsArray[k].length)
			  small=WordsArray[k];
		  if(large.length()<WordsArray.length())
			  large=WordsArray[k];
		}
		System.out.println("Smallest word : "+small);
		System.out.println("Largest word : "+large);
	}
}
