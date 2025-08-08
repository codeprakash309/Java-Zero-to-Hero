import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the first Number : ");
		int a=scn.nextInt();
		System.out.print("Enter the second number : ");
		int b=scn.nextInt();
		System.out.print("Enter the Arithmetic operator to (+,-,*,/,%) perform operation : ");
		char ch=scn.next().charAt(0);
		double d1,d2;
		switch(ch)
		{
		
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
		case '/':
			d1=(double)a;
			d2=(double)b;
			System.out.println(d1/d2);
			break;
		case '%':
			d1=(double)a;
			d2=(double)b;
			System.out.println(d1%d2);
            break;
        default:
        	System.out.println("invalid operation try again");



		}


      scn.close();

	}

}
