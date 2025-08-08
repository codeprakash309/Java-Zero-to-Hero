//how to swap two number without using 3rd variable in java
import java.util.Scanner;
class  SwapNumber2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first(X) Number : ");
		int x=sc.nextInt();
		System.out.print("Enter the Second(Y) Number : ");
		int y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After  swap  X =  "+x );
		System.out.println("After  swap  Y =  "+y);

	}
}
