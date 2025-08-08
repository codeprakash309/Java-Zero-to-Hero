//write a program to get the current date and time in java
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
class  CurrentDateTimeExample
{
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		System.out.print(dtf.format(now));
		System.out.println();
	}
}
