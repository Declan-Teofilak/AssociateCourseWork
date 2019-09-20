/**
 * 
 * @author Declan
 *
 */
import java.util.Random;

public class Coin {
	boolean face;
	int value;
	
public Coin()
{
	this.face = true;
}
public void flip()
{
	Random rand = new Random();
	int faceNum = rand.nextInt(10);
	// Makes face value Heads
	if (faceNum < 5)
	{
		this.face = true;
	}
	// Makes face value Tails
	else
	{
		this.face = false;
	}
}
public boolean getFace()
{

	return this.face;
}
@Override
public String toString() 
{
	String faceName;
	if (this.face == true)
	{
		faceName = "Heads";
	}
	else
	{
		faceName = "Tails";
	}
	return String.format(faceName);
}
}