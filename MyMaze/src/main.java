import java.util.Scanner;

public class main extends maze {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of the file: ");
		String choice = scan.nextLine();
		Maze m = new Maze(choice);
	}

}
