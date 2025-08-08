//write a java program to check Least Significant Bit(LSB) of a number using bitwise operator 
import java.util.Scanner;
class LSB 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
         int num=sc.nextInt();
		 int chk=1;
		 boolean b=(boolean)(num&chk);
		 if(b==true)
			 System.out.println("LSB of "+num+"is set (1)");
		 else
			  System.out.println("LSB of "+num+"is unset (0)");
	}
}
