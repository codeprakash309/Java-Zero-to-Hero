class ConstructorProgram1 
{
	private String name;
	private int age;
	ConstructorProgram1(String name ,int age)
	{
        this.name=name;
		this.age=age;
		show(name,age);
	}
	public static void show(String name,int age)
	{
     System.out.println("Name : "+name +"\n"+ "age : "+age);
	}
	public static void main(String[] args) 
	{
		ConstructorProgram1  obj=new ConstructorProgram1("prakash",23);

	}
}
