class SortCircuitOperatorEx2 
{
	public static void main(String[] args) 
	{
		System.out.println("************************IF(true&&ture)********************************");
		if(true&&true)
		{
          System.out.println("this output got printed because first condition is true ");
		}
		else
		{
       System.out.println("this  output  will  not  be  printed ");
		}
		System.out.println("************************IF(false&&true)*******************************");
		if(false&&true)
		{
		System.out.println("this output  will  not  be printed");
		}
		else
		{
			System.out.println("this output got printed because first condition is false");
		}
	}
}
