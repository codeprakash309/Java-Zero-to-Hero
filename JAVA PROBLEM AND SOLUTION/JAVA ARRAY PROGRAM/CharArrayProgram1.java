class CharArrayProgram1 
{
	public static void main(String[] args) 
	{
		char []a=new char[5];
		a[0]='a';
		a[1]=65;
		a[2]='@';
		a[3]=8;
		a[4]=55;
		System.out.println("print the corresponding ASCII value 'a' : "+(int)a[0]);  // 'a' ASCII value is printing that is 97
		System.out.println("print the corresponding ASCII character of the given value  : "+(char)a[1]);  // 'A' ASCII character is printing in this line
		System.out.println("print the character at 3rd position of an array : "+(int)a[3]);  //printing the value of at a[3] position in an array
		System.out.println("print the ASCII value of the given(55) number : "+a[4]);
	}
}
