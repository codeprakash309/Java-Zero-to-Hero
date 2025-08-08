//this program give you compile time error saying InterfaceDemo2.java:11: error: cannot assign a value to final variable name
 //     this.name=name;
 //         ^
//InterfaceDemo2.java:12: error: cannot assign a value to final variable age
 //         this.age=age;
interface Person
{
	String name="guddu";
	int age=21;
}
class Student implements Person
{
	Student(String name,int age)
	{
      this.name=name;
	  this.age=age;
	}
	public void M1()
	{
        System.out.println("Name  : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
class InterfaceDemo2 
{
	public static void main(String[] args) 
	{
		Student s=new Student("Prakash",23);
		s.M1();
	}
}
