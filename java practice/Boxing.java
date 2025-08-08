class Boxing 
{
	public static void main(String[] args) 
	{
		//convert int to Integer : boxing
		int num=20;
		Integer int_class=Integer.valueOf(num);  //explicit conversion from int to integer
		Integer inum=num ;    // autoboxing
		System.out.println("int => Integr : "+num+"=>"+inum);

		//convert Integer to int : unboxing
		Integer val=new Integer(5);
		int ival=val.intValue();  //explicit conversion from Integer to int 
		int jval=val;  //unboxing
		System.out.println("Integer => int: "+val+ "=>"+jval);
	}
}
