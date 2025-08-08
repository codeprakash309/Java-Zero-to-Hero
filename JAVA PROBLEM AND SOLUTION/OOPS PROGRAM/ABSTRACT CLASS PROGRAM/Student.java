abstract class Person
{
	//declaring two instance variables
	String name;   
	int age;
	Person(String name, int age)
	{
         this.name=name;
		 this.age=age;
	}
	abstract void show();    //abstract method
	public  void display()    //concrete method
	{
       System.out.println("Name  : "+name);
       System.out.println("Age  : "+age);
	}
}
class  Student extends Person
{
	//declaring two instance variables
	int rollno;
	int marks;
	Student(String name,int age,int rollno,int marks)
	{
	super(name,age);  //to call the parent class constructor
	super.display();     //to call the parent class method
	this.rollno=rollno;
	this.marks=marks;
	} 
	public void show()
	{
    System.out.println("RollNo : "+rollno);
    System.out.println("Marks : "+marks);
	}
	public static void main(String[] args) 
	{
		Student s=new Student("prakash",23,101,80);
        s.show();
		
	}
}
