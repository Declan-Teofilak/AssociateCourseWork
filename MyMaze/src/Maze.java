import java.io.FileNotFoundException;

public class Maze 
{
	private int ROW;
	private int COL;
	
	public Maze(String c) throws FileNotFoundException 
	{
		ROW = 0;
		COL = 0;
		readfile r = new readfile();
		
		r.openFile(c);
		for (int i = 0; i < 1; i++)
		{
			ROW = r.hasNext();
			COL = r.nextInt();
		}
	}
	
}
