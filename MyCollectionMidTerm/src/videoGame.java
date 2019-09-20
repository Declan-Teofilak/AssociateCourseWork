/**
 * Author: Declan T
 * 
 * Java program that generates a 'shelf' of video games, and allows the user to input, change, find, display, and delete
 * items by name within the program
 * 
 */
import java.text.Collator;

public class videoGame implements Comparable<videoGame>
{
	//year of game's publication
	int pubYear;
	//name of game
	String name;
	//console game was published on
	private String console;
public videoGame(int y, String n, String c)
/**
 * video game constructor
 * @param y game year
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
 * default video game constructor
 */
{
	this.pubYear = 1989;
	this.name = "Donkey Kong";
	this.console = "Arcade";	
}
public String getName()
/**
 * standard getter for name
 * @return name of chosen object
 */
{
	return this.name;
}
public String getConsole()
/**
 * standard getter for console
 * @return console of chosen object
 */
{
	return this.console;
}
public int getYear()
/**
 * standard getter for year
 * @return year of chosen object
 */
{
	return this.pubYear;
}
public void setName(String n)
/**
 * standard setter for name
 * @param n new name for game
 */
{
	this.name = n;
}
public void setpubYear(int y)
/**
 * standard setter for name
 * @param y new year for game
 */
{
	this.pubYear = y;
}
public void setConsole(String c)
/**
 * standard setter for name
 * @param c new console for game
 */
{
	this.console = c;
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
@Override
public String toString()
/**
 * standard to string of all data held by the object
 * @return concatenation of the name, console, and published year 
 */
{
	String result = name + " - " + console + " - " + pubYear;
	return result;
}
}
