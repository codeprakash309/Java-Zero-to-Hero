//prove the String object are immutable in java
class  ProveStringImmutable
{
	public static void referenceCheck(Object x, Object y)
	{
    if(x==y)
		System.out.println("Both pointing to the same reference");
	else
		System.out.println("Both are pointing to different reference");
	}
	public static void main(String[] args) 
	{
		String str1="java";
		String str2="java";
		System.out.println("before Modification in str1");
		referenceCheck(str1,str2);
		str1+="ava";
		System.out.println("\n");
		System.out.println("After Modification");
		referenceCheck(str1,str2);
	}
}
