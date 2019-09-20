import java.util.Random;

public class CoinValue extends Coin {
	//Holds coin's value
	int centValue = 0;
	//array of possible values
	int arr[] = {1, 5, 10, 25, 50, 100};
	
	public CoinValue() 
	{
		super();
		this.centValue = 0;
	}
	public void assignValue()
	{
		Random rand = new Random();
		int choice = rand.nextInt(5);
		this.centValue = arr[choice];

	}
	public int getValue()
	{
		return this.centValue;
	}
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
		return String.format(faceName + " " + centValue);
	}

}
