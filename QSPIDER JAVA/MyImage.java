import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class MyImage 
{
	public static void main(String[] args) throws FileNotFoundException,InterruptedException
	{
		File file=new File("C:\Users\powni\OneDrive\Desktop\\art.txt");
		Scanner reader=new Scanner(file);
		while(reader.hasNestLine())
		{
       String line=reader.nextLine();
	   Sysytem.out.println(line);
	   thread.sleep(54);
		}
		
	}
}
