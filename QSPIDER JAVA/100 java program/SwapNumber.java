//how to swap two number using 3rd variable in java
import java.util.Scanner;
class  SwapNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number : ");
		int x=sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int y=sc.nextInt();
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After  swap  X =  "+x );
		System.out.println("After  swap  Y =  "+y);

	}
}
