//the insert() method insert the given String with this string at the given position
class InsertMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.insert(1,"java");  //now original string is changed,
		System.out.println(sb);
	}
}
