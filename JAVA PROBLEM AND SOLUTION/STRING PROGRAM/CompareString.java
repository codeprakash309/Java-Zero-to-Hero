//how to compare two String in java program

class CompareString  
{
	public static void main(String[] args) 
	{
		String s1="hello";      //string literal
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="falg";
		System.out.println("String s1 : "+s1+"  compare with "+"  String s2 : "+s2+ " =>  "+s1.compareTo(s2));  //0 because both are equal
		System.out.println("String s1 : "+s1+"  compare with "+"  String s2 : "+s3+ " =>  "+s1.compareTo(s3));  //-5 becouse "h" is 5 times lower than  "m"
		System.out.println("String s1 : "+s1+"  compare with "+"  String s2 : "+s4+ " =>  "+s1.compareTo(s4)); //-1 because "l" is 1 times lower than  "m"
		System.out.println("String s1 : "+s1+"  compare with "+"  String s2 : "+s5+ " =>  "+s1.compareTo(s5));  //2 because "h" is 2 times greater than "f"
		System.out.println("String s1 : "+s3+"  compare with "+"  String s2 : "+s4+ " =>  "+s3.compareTo(s4));//5 because "m" is 5 times greater than "h"
		System.out.println("String s1 : "+s4+"  compare with "+"  String s2 : "+s5+ " =>  "+s4.compareTo(s5));//2 because "h" is 2 times greater than "f"
	}
}
