//the append() method concatenates the given argumnets with the this String
class AppendMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("java");  //now original string is changed
		System.out.println(sb);
	}
}
