	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	import java.io.*;
	class MyArt 
	{
	public static final String ANSI_RESET="\u001B[0m";
	public static final String ANSI_YELLOW ="\u001B[33m";
	public static void main(String[] args) throws FileNotFoundException,InterruptedException
		{
			File file=new File("C:\\Users\\powni\\OneDrive\\Desktop\\krishna.txt");
			Scanner reader=new Scanner(file);
			while(reader.hasNextLine())
			{
	       String line=reader.nextLine();
		   System.out.println(ANSI_YELLOW + line +ANSI_RESET);
		   Thread.sleep(85);

			}
			
		}
	}

