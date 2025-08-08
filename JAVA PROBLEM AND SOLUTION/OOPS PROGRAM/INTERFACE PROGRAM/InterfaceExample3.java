interface shape
{
	void draw();
}
class Circle implements shape
{
	//override draw method in circle class
	public void draw()
	{
    System.out.println("drawing circle...........");
	}
}
class Rectangle implements shape
{
	//override draw method in rectangle class
	public void draw()
	{
    System.out.println("drawing Rectangle...........");
	}
}
class InterfaceExample3
{
	public static void main(String[] args) 
	{
	
	}
}
