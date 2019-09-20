
public class bird extends ArrayList 
{
	//private variables
	private String name;
	private int age;
	private String breed;
	
	//constructor
	//@param n - name
	//@param a - age
	//@param b - breed
	public bird(String n, int a, String b) 
	{
		this.name = n + " ";
		this.age = a;
		this.breed = b + " ";
	}
	//default constructor
	public bird()
	{
		this.name = "Bones ";
		this.age = 3;
		this.breed = "Cockatiel ";
	}
	//setters
	//@param n - name for bird
	public void setName(String n)
	{
		this.name = n;
	}
	public void setAge(int a)
	{
		this.age = a;
	}
	public void setBreed(String b)
	{
		this.breed = b;
	}
	//getters
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getBreed()
	{
		return this.breed;
	}
	@Override
	//toString of all variables
	public String toString()
	{
		String result = getBreed() + getName() + getAge();
		return result;
	}
}
