
public class TossDemo
{

	public static void main(String[] args) 
	{
		// initialize array of Coins
		CoinValue[] wallet = new CoinValue[7];
		// track total of head's values
		int total = 0;
		// for each coin, flip, assign, and add if heads
		for (CoinValue i : wallet)
		{
			i = new CoinValue();
			i.flip();
			i.assignValue();
			
			if (i.getFace() == true)
			{
				total = total + i.getValue();
			}
			// prints coin to screen regardless of it being heads or tails
			System.out.println(i.toString());
			System.out.println();
		}
		System.out.println("Total: " + total);
		}
		
	}

