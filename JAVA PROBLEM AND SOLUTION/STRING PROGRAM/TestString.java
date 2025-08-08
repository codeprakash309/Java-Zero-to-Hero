//getClass() method are used to find the class name as well as method information,constructor
import java.lang.reflect.*;
class TestString 
{
	public static void main(String[] args) 
	{
		int count=0;
		Object o=new String("guddu");
		Class c=o.getClass();
		System.out.println("fully qualified name of class : "+c.getName());
		Method[]m=c.getDeclaredMethods();
		System.out.println("method information ");
		for(Method m1:m)
		{
           count++;
		   System.out.println(m1.getName());
		}
		System.out.println("the number of methods : "+count);
	}
}
