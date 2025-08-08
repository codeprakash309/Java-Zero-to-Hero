//how to convert fahrenheit to celcius program in java
import java.util.Scanner;
class  FahrenheitToCelcius
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in  Fahrenheit  : ");
		float temperature=sc.nextInt();
		temperature=((temperature-32)*5)/9;
		System.out.print("Temperature in celcius : "+temperature);
		System.out.println();
	}
}
