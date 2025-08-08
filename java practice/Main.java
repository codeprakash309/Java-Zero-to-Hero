final class City
{
	final String city_name;
	final int cityId;
	//prameterised constructor
	public City(String name, int id)
	{
      this.city_name=name;
	  this.cityId=id;
	}
	//getter for member variables
	public String getCityName()
	{
   return city_name;
	}
	public int getCityId()
	{
    return cityId;
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		City c=new City("new york", 1001);
		System.out.println("City Id : "+c.getCityId()+"");
		System.out.println("City Name : "+c.getCityName());
		//c.cityId=1002;    //cannot assign a value to final variable regNo
	}
}
