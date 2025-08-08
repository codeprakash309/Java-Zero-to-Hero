

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Prime 
{


	public static void main(String[] args) throws IOException
	{
		InputStream InputStream=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(InputStream));
		String n=br.readLine();
		BigInteger bi=new BigInteger(n);
		System.out.println(bi.isProbablePrime(10)?"prime":"not prime");
		br.close();

	}
}
