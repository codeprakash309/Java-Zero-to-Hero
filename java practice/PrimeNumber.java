
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class PrimeNumber 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(null));
		String n=br.readLine();
		BigInteger bi=new BigInteger(n);
		System.out.println(bi.isProbablePrime(10)?"prime":"not prime");
		br.close();

	}
}
