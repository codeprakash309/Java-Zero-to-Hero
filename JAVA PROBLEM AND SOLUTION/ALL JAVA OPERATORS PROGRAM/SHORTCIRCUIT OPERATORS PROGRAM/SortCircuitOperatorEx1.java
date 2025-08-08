class SortCircuitOperatorEx1 
{
	public static void main(String[] args) 
	{
		//since first operand is false
		//and operator is &&,
		//Evaluation stops and
		//false is returned
		if(false&&true&&true)
		{
		System.out.println("this output  will  not  be printed");
		}
		else
		{
			System.out.println("this  output  got printed actually,  due to  short   circuit");
		}
		//whole expression will be evaluated
		//as no false is encountered
		//before last condition
		//Therefore no short circuit
		System.out.println("***************************************************************");
		if(true&&true&&true)
		{
          System.out.println("this output gets  print  as there will be no short circuit");
		}
		else
		{
       System.out.println("this  output  will  not  be  printed ");
		}
		System.out.println("************************########************************************");
		if(true&&true)
		{
		System.out.println("this  output  got printed actually,  due to  short   circuit");
		}
		else
		{
			System.out.println("this output  will  not  be printed");
		}
	}
}
