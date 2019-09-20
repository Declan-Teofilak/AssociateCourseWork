/**
 * Object class intended for use in testing stack functionality.
 * default constructor, parameterized constructor, and toString
 * @author Declan
 *
 */
public class dogs extends Stack
{
	//initialized variables
	String breed;
	int weight;
	int age;
	/**
	 * default constructor for dogs object
	 * 
	 * @author Declan
	 *
	 */
	dogs()
	{
		String breed = "";
		int weight = 0;
		int age = 0;
	}
	/**
	 * constructor for dogs object with parameters
	 * @param b = breed
	 * @param w = weight
	 * @param a = age
	 *
	 */
	dogs(String b, int w, int a)
	{
		this.breed = b;
		this.weight = w;
		this.age = a;
	}
	/**
	 * basic toString override that prints the three variables assigned to the object
	 * @return result concatenation of variables in a string
	 */
	@Override
	/**
	 * basic toString operation that uses the variables stored in the object
	 * and stores them in a variable to be printed by the stack class
	 * @return result - concatenated string of variables
	 */
	public String toString()
	{
		String result = "| " + breed + " - " + weight + " - " + age + " |";
		return result;
	}
}
