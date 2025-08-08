import java.util.*;
class RuntimeDemo 
{
	public static void main(String[] args) 
	{

		Runtime r=Runtime.getRuntime();
		System.out.println("total  memory : "+r.totalMemory());
		System.out.println(" free memory : "+r.totalMemory());
		for(int i=0;i<10000;i++)
		{
              Date d=new Date();
			  d=null;
		}
		System.out.println("now free memory is : "+r.freeMemory());
		r.gc();
		System.out.println("now free memory is : "+r.freeMemory());
	}
}
