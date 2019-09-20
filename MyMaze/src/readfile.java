import java.io.File;
import java.util.Scanner;

public class readfile 
{
	private Scanner x;
	
	public void openFile(String a)
	{
		try 
		{
		x = new Scanner(new File(a));
		}
		catch (Exception e)
		{
			System.out.println("Could not read file: ");
		}
	}
}
