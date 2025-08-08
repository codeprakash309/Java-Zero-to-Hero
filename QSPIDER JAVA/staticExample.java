class staticExample 
{  
	int number=0;  //it is a non-static variable
	public static void main(String[] args) 
	{   
		//using non-static  variable by creating an object of the class
		staticExample obj= new staticExample();
		obj.number++;
		System.out.println(obj.number); //it is possible if and only if u creating an object of that class then u can access the non-static variable in the static method   
	}
}
