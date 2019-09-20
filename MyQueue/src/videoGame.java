/**
 * 
 * @author Declan
 *	videoGame class for use in queue class
 *	
 */
public class videoGame implements Comparable<videoGame>
{
	//year of game's publication
	int pubYear;
	//name of game
	private String name;
	//console game was published on
	private String console;
public videoGame(int y, String n, String c)
/**
 * custom constructor for videoGame class
 * @param y game release year
 * @param n game name
 * @param c game release console
 */
{
	this.pubYear = y;
	this.name = n;
	this.console = c;
}
public videoGame() 
/**
 * default videoGame class constructor
 */
{
	this.pubYear = 1989;
	this.name = "Donkey Kong";
	this.console = "Arcade";	
}
public String getName()
/**
 * basic name variable getter
 * @return name name of given object
 */
{
	return this.name;
}
public String getConsole()
/**
 * basic console variable getter
 * @return console release console of given object
 */
{
	return this.console;
}
public int getYear()
/**
 * basic year variable getter
 * @return pubYear release year of given object
 */
{
	return this.pubYear;
}
public void setName(String n)
/**
 * basic name variable setter
 * @param n name of given object
 */
{
	this.name = n;
}
public void setpubYear(int y)
/**
 * basic pubYear variable setter
 * @param y publishing year of given object
 */
{
	this.pubYear = y;
}
public void setConsole(String c)
/**
 * basic console variable setter
 * @param c release console of given object
 */
{
	this.console = c;
}
@Override
public String toString()
/**
 * custom toString method that concatenates the objects name
 * console, and pubYear to create a string of all the objects
 * data
 * @return result concatenated data
 */
{
	String result = name + " - " + console + " - " + pubYear;
	return result;
}
public interface Comparable
//allows for comparison of objects within compare to class
{
 int compareTo(videoGame v1);
}
public int compareTo(videoGame v1)
/**
* uses the publishing year of chosen game and compares it to other
* publishing years
* @param v1 initial game to compare
* @return 1, -1, or 0 depending on the relationship
*/
{
	videoGame v2 = (videoGame) v1;
	if(pubYear > v2.getYear())
	{
		return 1;
	}
	else if (pubYear == v2.getYear())
	{
		return 0;
	}
	else
	{
		return -1;
	}
}
}